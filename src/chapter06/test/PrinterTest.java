package chapter06.test;

class Printer{

    public static void logout(Object obj){
        System.out.println(obj);
    }

    public static void println(int value) {
        logout(value);
    }
    public static void println(boolean value) {
        logout(value);
    }
    public static void println(double value) {
        logout(value);
    }
    public static void println(String value) {
        logout(value);
    }
}

public class PrinterTest {
    public static void main(String[] arg) {

        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
        System.out.println();
    }
}
