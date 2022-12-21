package chapter06.exam03;

public class Car {
    //Field
    int gas;

    void setGas(int gas){
        this.gas = gas;
    }

    public boolean isLeftGas(){
        if (gas==0){
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    public void run(){
        while(true){
            if (gas>0){
                System.out.printf("달립니다.(gas잔량: %d)\n",gas);
                gas--;
            }
            else{
                System.out.printf("멈춥니다.(gas잔량: %d)\n",gas);
                return;
            }
        }
    }

}
