package chapter06.test;

class Account {
    private int balance;
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        boolean isBalance = balance >= MIN_BALANCE && balance <= MAX_BALANCE;
        if (!isBalance) {
            return;
        }
        this.balance = balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고:"+account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고:"+account.getBalance());
    }
}
