package chapter07.exam08;

public class SmartPhone extends Phone {

    //Constructor
    SmartPhone(String owner){
        super(owner);
    }

    //Method
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
