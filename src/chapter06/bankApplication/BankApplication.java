package chapter06.bankApplication;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        String[] str = {"계좌생성", "계좌목록", "예금", "출금", "종료" };
        boolean run = true;

        Scanner sc = new Scanner(System.in);
        Account[] account = new Account[100];
        int accountNum = 0;


        while (run) {
            opening(str);
            int isNum = sc.nextInt();
            chooseStr(str, isNum);
            if (isNum == 1) {
                account[accountNum] = new Account();
                account[accountNum++].createAccount();
            } else if (isNum == 2) {
                for (int i = 0; i < account.length; i++) {
                    if (account[i] == null)
                        break;
                    System.out.println(account[i]);
                }
            } else if (isNum == 3) {
                plusBalance(account, sc);
            } else if (isNum == 4) {
                minusBalance(account, sc);
            } else if (isNum == 5) {
                run = false;
            }
        }
        System.out.println("프로그램종료");


    }

    public static void minusBalance(Account[] account, Scanner sc) {
        System.out.print("계좌번호 :");
        String findAccount = sc.next();

        for (int i = 0; i < account.length; i++) {
            if (account[i] == null)
                break;
            else if (account[i].getAccount_Number().equals(findAccount)) {
                System.out.print("출금액: ");
                int minusBalance = account[i].getBalance() - sc.nextInt();
                account[i].setBalance(minusBalance);
                System.out.println("결과: 출금이 성공하었습니다.");
                break;
            }
        }

    }

    public static void plusBalance(Account[] account, Scanner sc) {
        System.out.print("계좌번호 :");
        String findAccount = sc.next();

        for (int i = 0; i < account.length; i++) {
            if (account[i] == null)
                break;
            else if (account[i].getAccount_Number().equals(findAccount)) {
                System.out.print("예금액: ");
                int plusBalance = account[i].getBalance() - sc.nextInt();
                account[i].setBalance(plusBalance);
                break;
            }
        }

    }

    public static void opening(String[] str) {

        System.out.println("------------------------------------------------");
        System.out.printf("1.%s | 2.%s | 3.%s | 4.%s | 5.%s\n", str[0], str[1], str[2], str[3], str[4]);
        System.out.println("------------------------------------------------");
        System.out.print("선택> ");

    }

    public static void chooseStr(String[] str, int isNum) {
        System.out.println("---------");
        System.out.printf("%s\n", str[isNum - 1]);
        System.out.println("---------");
    }
}
