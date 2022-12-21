package chapter04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료할려면 q를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do{
            System.out.print(">");
            inputString = sc.nextLine();
            System.out.println(inputString);
        }while (!(inputString.equals("q")));
        //q가 아닐경우 !false -> ture가 되어 무한반복

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
