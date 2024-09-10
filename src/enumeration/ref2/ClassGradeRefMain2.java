package enumeration.ref2;

public class ClassGradeRefMain2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 할인금액 : " + basic);
        System.out.println("GOLD 할인금액 : " + gold);
        System.out.println("DIAMOND 할인금액 : " + diamond);
    }
}
