package chapter08.exam01;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("오디오를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끔니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 라디오 볼퓸: "+ this.volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute){
        if (mute){
            System.out.println("무음처리합니다.");
            this.memoryVolume = this.volume;
            setVolume(MIN_VOLUME);
        }
        else {
            System.out.println("무음을 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
