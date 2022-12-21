package chapter06.bankApplication;

import java.util.Scanner;

public class Account {
    private String account_Number;
    private String account_Holder;
    private int balance;

    Scanner sc = new Scanner(System.in);

    public void createAccount(){
        System.out.print("계좌번호: ");
        account_Number = sc.next();
        System.out.print("계좌주: ");
        account_Holder = sc.next();
        System.out.print("초기입금액: ");
        balance = sc.nextInt();

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    public String toString(){
        return account_Number+"\t"+account_Holder+" \t "+balance;
    }

    public String getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(String account_Number) {
        this.account_Number = account_Number;
    }

    public String getAccount_Holder() {
        return account_Holder;
    }

    public void setAccount_Holder(String account_Holder) {
        this.account_Holder = account_Holder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
