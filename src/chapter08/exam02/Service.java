package chapter08.exam02;

public interface Service {
    //디폴트 메소드
    default void defaultMethod1(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" 종속 코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    static void staticMethod1(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" 종속 코드");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()+" 종속 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }
}
