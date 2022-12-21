package chapter06.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        double result = 10 * 10 * Calculator.pi;
        int plus = Calculator.plus(10,5);
        int minus = Calculator.minus(10,5);

        System.out.println(result);
        System.out.println(plus);
        System.out.println(minus);
    }
}
