package chapter08.exam04;

public class InterfaceImpl implements InterfaceC {

    @Override
    public void methodA() {
        System.out.println("InterfaceAImpl-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceBImpl-methodA() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl-methodA() 실행");
    }
}
