import java.math.BigDecimal;

public class Person {
    private final String name;
    private final int age;
    private final BigDecimal salary;

    public Person(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public BigDecimal getSalary() {
        return salary;
    }
}
