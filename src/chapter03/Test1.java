package chapter03;

public class Test1 {
    public static void main(String[] args) throws ArithmeticException {
        double x = 5.0;
        double y = 0.0;

        double z = x % y;

        if (Double.isNaN(z)) {
            throw new ArithmeticException("0.0으로 나눌수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println(result);
        }
    }
}
