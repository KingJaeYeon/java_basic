package chapter05;

public class SplitExample {
    public static void main(String[] args) {

        String board = "1,자바 학슴,참조 타입 String을 학습합니다.,홍길동";
        String[] token = board.split(",");

        for (String c : token){
            System.out.println(c);
        }
    }}
