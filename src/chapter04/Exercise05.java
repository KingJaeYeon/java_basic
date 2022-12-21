package chapter04;

public class Exercise05 {
    public static void main(String[] args) {

        int res = 0;

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int input = (x * 4) + (y * 5);
                if (input == 60) {
                    System.out.println(x + "," + y);
                }
            }
        }
    }
}
