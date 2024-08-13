package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address address1 = new Address("서울");
        Address address2 = address1;

        System.out.println(address1 + " , " + address2);
        change(address2, "주소 변경");

        System.out.println(address1 + " , " + address2);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경 : " + changeAddress);
        address.setValue(changeAddress);
    }
}
