package com.geekbrains.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DataBaseBuilder {
    private Connection connection;
    private Statement statement;
    private boolean isConnected = false;

    public DataBaseBuilder() {
    }

    public void connect(String url) throws SQLException {
        try {
            isConnected = false;
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("JDBC:sqlite:" + url);
            statement = connection.createStatement();
            isConnected = true;
        } catch (SQLException e) {
            throw new SQLException("Unable to connect");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void disconnect(){
        try {
            statement.close();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    public void buildTable(Class clazz) throws ConnectException, SQLException {
        if (!isConnected) {
            throw new ConnectException();
        }
        if (!clazz.isAnnotationPresent(Table.class)) {
            throw new RuntimeException("@Table has been missed out");
        }
        var sb = new StringBuilder("CREATE TABLE ");
        sb.append(((Table)clazz.getAnnotation(Table.class)).title());
        sb.append(" (");
        var fields = clazz.getDeclaredFields();
        for (var f : fields) {
            if (f.isAnnotationPresent(Column.class)) {
                var title = f.getName();
                if (!f.getAnnotation(Column.class).title().isBlank())
                    title = f.getAnnotation(Column.class).title();
                sb.append(title)
                        .append(" ")
                        .append(toSqlType(f.getType()))
                        .append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append(");");
        statement.executeUpdate(sb.toString());
    }

    public void dropTable(Class clazz) {
        if (!clazz.isAnnotationPresent(Table.class)) {
            return;
        }
        try {
            statement.executeUpdate("DROP TABLE " + ((Table) clazz.getAnnotation(Table.class)).title() + ";");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static class ConnectException extends Exception {
        public ConnectException() {
            super("Error: Database isn't connected");
        }
    }


    public boolean isConnected() {
        return isConnected;
    }

    private static String toSqlType(Class clazz) {
        HashMap<Class, String> map = new HashMap<>();
        map.put(int.class, "INTEGER");
        map.put(String.class, "TEXT");
        return map.get(clazz);
    }
}
