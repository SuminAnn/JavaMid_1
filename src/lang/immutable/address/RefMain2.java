package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress address1 = new ImmutableAddress("서울");
        ImmutableAddress address2 = address1; //참조값 대입을 막을 수 있는 방법은 없다(자바 문법상)

        System.out.println(address1 + " , " + address2);
        // address2.setValue("주소 변경"); //adress를 final로 선언했기 때문에 set이 불가(불변객체)

        address2 = new ImmutableAddress("부산"); //값을 변경하기 위해서 객체를 새로 생성한다

        System.out.println(address1 + " , " + address2);
    }
}
