package chapter07.exam08;

import chapter07.exam07.Person;

public abstract class Phone {
    //Field
    String owner;

    //Constructor
    Phone(String owner){
        this.owner = owner;
    }

    //Method
    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
