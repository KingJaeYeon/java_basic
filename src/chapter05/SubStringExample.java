package chapter05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); // 0~5 6전까지
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); //7부터 시작해서 전부
        System.out.println(secondNum);
    }
}
