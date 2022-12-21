package chapter04;

public class DiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;
        showInfo(num);
    }

    private static void showInfo(int num) {
        System.out.println(num+"번이 나왔습니다.");
    }
}
