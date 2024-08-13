package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        Address address1 = new Address("서울");
        Address address2 = new Address("서울");

        System.out.println(address1 + " , " + address2);
        address2.setValue("주소 변경");

        System.out.println(address1 + " , " + address2);
    }
}
/*
 * 참조형은 참조값을 공유하기 때문에 기존에 문제가 발생한다
 * 해결 방안은 참조값을 공유하지 않도록 객체를 각각 생성하면 된다 -> 여러 변수가 하나의 객체를 공유하지 않으면
 * 그러면 각각 인스턴스를 참조한다
 * 단 하나의 객체를 여러 변수가 공유하지 않도록 강제로 막을 수 있는 방법이 없다
 */
