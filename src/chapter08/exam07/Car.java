package chapter08.exam07;

public class Car {
    //필드
    Tire tire1 = new KumHoTire();
    Tire tire2 = new HanKook();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}
