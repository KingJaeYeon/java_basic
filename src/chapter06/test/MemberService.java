package chapter06.test;

public class MemberService extends Member{

    public boolean login(String id, String password){
        boolean isCustomer = id.equals("hong") && password.equals("12345");
        if (!isCustomer) return false;
        return true;
    }

    public void logout(String id){
        System.out.println(id+"님이 로그아웃 되었습니다.");
    }
}
