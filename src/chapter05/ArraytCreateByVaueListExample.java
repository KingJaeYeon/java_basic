package chapter05;

public class ArraytCreateByVaueListExample {
    public static void main(String[] args) {

        //[1]
        int[] score;
        score = new int[]{83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < score.length; i++) {
            sum1 += score[i];
        }
        System.out.println(sum1);

        //[2] 배열을 매개값으로 주고, printItem() 메서드 호출
        printItem(new int[]{83, 90, 87});
    }

    public static void printItem(int[] score) {
        for (int i = 0; i < score.length; i++) {
            System.out.printf("score[%d]: %d\n", i, score[i]);
        }
    }
}
