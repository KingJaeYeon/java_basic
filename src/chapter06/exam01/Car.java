package chapter06.exam01;

public class Car {
    //Field
    String company = "BMW";
    String model;
    String color;
    int maxSpeed;

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "model:" + model + ", color:" + color + ", maxSpeed:" + maxSpeed;
    }
}
