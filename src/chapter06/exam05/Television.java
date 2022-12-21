package chapter06.exam05;

public class Television {
    static String company = "MyCompany";
    static String model = "LDC";
    static String info;

    static {
        info = company+"-"+model;
    }
}
