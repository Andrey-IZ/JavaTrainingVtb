package com.geekbrains.homework;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) {
        DataBaseBuilder dbb = new DataBaseBuilder();
        try {
            dbb.connect("students.db");
            dbb.dropTable(Student.class);
            dbb.buildTable(Student.class);
        } catch (SQLException | DataBaseBuilder.ConnectException e) {
            e.printStackTrace();
        } finally {
            dbb.disconnect();
        }
    }
}
