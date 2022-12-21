package chapter05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //길이가 3인 배열
        String[] oldArray = {"java","array","copy"};
        //길이가 5인 배열 새로생성
        String[] newStrArray = new String[5];

        System.arraycopy(oldArray,0,newStrArray,0,oldArray.length);

        for (String a : newStrArray){
            System.out.println(a);
        }
    }
}
