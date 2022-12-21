package chapter06.exam07;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton(); // 컴파일 에러뜸
        생성자를 private 으로 막아두면 new 클래스이름()으로 객체 생성 불가능함
         */

        //정적 메소드를 호출해서 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        //동일한 객체를 참조하는지 확인
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다,");
        }
    }
}
