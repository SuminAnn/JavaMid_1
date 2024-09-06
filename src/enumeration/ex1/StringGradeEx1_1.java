package enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 할인금액 : " + basic);
        System.out.println("GOLD 할인금액 : " + gold);
        System.out.println("DIAMOND 할인금액 : " + diamond);
    }
}
/*
 * 문자열 상수를 사용한 덕분에 전체적으로 코드가 더 명확해졌다
 * 실수로 상수의 이름을 잘못 입력하면 컴파일 시점에 오류가 발생한다
 * 따라서 오류를 쉽고 빠르게 찾을 수 있다
 * 
 * 하지만 String 타입은 어떤 문자열이든 입력할 수 있기 때문에 근본적인 해결방법은 아니다
 */