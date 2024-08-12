package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        Userv2 user1 = new Userv2("id-100");
        Userv2 user2 = new Userv2("id-100");

        System.out.println("identity = " + (user1 == user2)); //false : 다른 인스턴스로 참조값이 다르다
        System.out.println("equality = " + user1.equals(user2)); //true : equals를 id기준으로 비교하도록 재정의 했기 때문
    }
}
