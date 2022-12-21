package chapter09.exam05;

public class A {
    //Method
    public void method1(int arg) { //final int arg
        //local variable
        int var = 1; // final int var =1;

        //local class
        class B {
            //Method
            void method2(){
                //local variable 읽기
                System.out.print("arg :" + arg);
                System.out.print("var :" + var);
                /*
                local variable 수정
                arg = 2; x
                var = 2; x
                 */
            }
        }

        //로컬 객체 생성
        B b = new B();
        //로컬 메소드 호출
        b.method2();

        /*
        로컬 변수 수정
        arg = 3;  x
        var = 3;  x
         */

    }
}

