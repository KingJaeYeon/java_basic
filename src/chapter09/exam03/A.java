package chapter09.exam03;

public class A {
    //생성자
    A(){
        //로컬 클래스 생성
        class B{}
        //로컬 객체 생성
        B b = new B();
    }
    //메소드
    void method1(){
        //로컬 클래스 생성
        class B{}
        //로컬 객체 생성
        B b = new B();
    }
}
