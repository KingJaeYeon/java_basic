package chapter08.exam01;

public class RemoteControlExample {
    public static void main(String[] args) {
        System.out.println("리모콘 최대 볼륨 :"+RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨 :"+RemoteControl.MIN_VOLUME);
        System.out.println();

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(7);
        rc.turnOff();
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();
        RemoteControl.changeBattery();
    }
}
