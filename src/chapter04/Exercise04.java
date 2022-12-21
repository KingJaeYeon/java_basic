package chapter04;

public class Exercise04 {
    public static void main(String[] args) {
        int i = 0;

        while (i!=5){
            int a = (int)(Math.random()*6)+1;
            int b = (int)(Math.random()*6)+1;
            i = a+b;
            System.out.println(a+","+b);
        }
    }

}
