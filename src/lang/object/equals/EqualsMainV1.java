package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        Userv1 user1 = new Userv1("id-100");
        Userv1 user2 = new Userv1("id-100");

        System.out.println("identity = " + (user1 == user2)); //false : 다른 인스턴스로 참조값이 다르다
        System.out.println("equality = " + (user1.equals(user2))); //false : object의 기본 제공 equals는 ==으로 동일성 비교를 제공한다
    }
}
/*
 * 동등성이라는 개념은 각 클래스 마다 다르다. 어떤 클래스는 주민등록번호를 기반으로 동등성 처리할 수 있고
 * 어떤 클래스는 연락처를 기반으로 동등성을 처리할 수 있다
 * 따라서 동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의해야 한다.
 */
