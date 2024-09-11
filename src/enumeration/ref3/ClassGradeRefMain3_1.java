package enumeration.ref3;

public class ClassGradeRefMain3_1 {

    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC 할인금액 : " + Grade.BASIC.discount(price));
        System.out.println("GOLD 할인금액 : " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 할인금액 : " + Grade.DIAMOND.discount(price));
    }
}
