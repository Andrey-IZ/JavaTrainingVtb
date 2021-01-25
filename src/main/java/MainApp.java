public class MainApp {
    public static void main(String[] args) {
        var calc = new Calculator(10_000_000);
        calc.calculate();
        System.out.println("-------------------------");
        calc.calculateThreaded();
    }
}
