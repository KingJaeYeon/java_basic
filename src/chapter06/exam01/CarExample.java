package chapter06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("자가용");
        System.out.println(car1);

        Car car2 = new Car("자가용","빨간색");
        System.out.println(car2);

        Car car3 = new Car("택시","검정",200);
        System.out.println(car3);

    }

}
