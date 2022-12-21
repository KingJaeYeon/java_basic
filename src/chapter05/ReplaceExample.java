package chapter05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바","JAVA");
        System.out.println(oldStr);  //자바 프로그래밍
        System.out.println(newStr);  //JAVA 프로그래밍
    }
}
