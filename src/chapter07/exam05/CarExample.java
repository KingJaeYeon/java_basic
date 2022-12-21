package chapter07.exam05;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        //Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        //HanKookTire 객체 장착
        myCar.tire  = new HanKookTire();
        myCar.run();

        //KumHoTire 객체 장착
        myCar.tire = new KumHoTire();
        myCar.run();

    }
}
