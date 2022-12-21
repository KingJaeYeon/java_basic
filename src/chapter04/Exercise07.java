package chapter04;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) throws IOException {
        boolean run = true;
        int balance = 0;

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택>");

            int c = System.in.read();

            if (c == 49) {
                System.out.print("예금액>");
                balance += sc.nextInt();
            } else if (c == 50) {
                System.out.print("출금>");
                balance -= sc.nextInt();
            } else if (c == 51) {
                System.out.println("잔고>" + balance);
            } else if (c == 52) {
                break;
            }
        }
        System.out.println("프로그램종료");
    }
}
