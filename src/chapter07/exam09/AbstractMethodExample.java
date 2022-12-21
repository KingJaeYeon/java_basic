package chapter07.exam09;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성
        animalSound(dog);
        animalSound(cat);
    }

    public static void animalSound(Animal animal/*자동 타입 변환*/){
        animal.sound(); // 재정의 된 메소드 호출
    }
}
