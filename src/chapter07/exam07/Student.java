package chapter07.exam07;

public class Student extends Person{
    //Field
    public int studentNo;

    //Constructor
    Student(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }

    //Method
    public void study(){
        System.out.println("공부를 합니다.");
    }
}
