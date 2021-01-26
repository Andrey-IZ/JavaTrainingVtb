import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        oftenestWord("aa", "ss", "aa", "12", "a4");
        Person[] staff = new Person[]{
                new Person("bob", 22, new BigDecimal("12.4")),
                new Person("John", 96, new BigDecimal("124")),
                new Person("Micheal", 32, new BigDecimal("155.4")),
                new Person("Bill", 62, new BigDecimal("126.2")),
                new Person("Donald", 25, new BigDecimal("14.4")),

        };
        System.out.println(avgSalary(staff));
        System.out.println(findOldestWorker(2, staff));

    }

    public static double avgSalary(Person[] staff) {
        return Arrays.stream(staff).mapToDouble(person -> person.getSalary().doubleValue()).average().orElse(0);
    }

    public static String findOldestWorker(int amount, Person[] people) {
        return Arrays.stream(people)
                .sorted((person, t1) -> t1.getAge() - person.getAge())
                .limit(amount)
                .map(Person::getName)
                .collect(Collectors.joining(", ", amount + " самых старших сотрудников зовут: ", ";"));
    }

    public static void oftenestWord(String... words) {
        var mw = Stream.of(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(es -> es.getValue()))
                .get().getKey();
        System.out.println(mw);
    }
}
