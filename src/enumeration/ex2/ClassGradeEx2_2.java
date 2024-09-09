package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        // int price = 10000;

        // DiscountService discountService = new DiscountService();
        // ClassGrade classGrade = new ClassGrade();
        // int result = discountService.discount(classGrade, price);

        // System.out.println("result : " + result);
    }
}
/*
 * 이 문제를 해결하려면 외부에서 ClassGrade를 생성할 수 없도록 막으면 된다
 * 기본생성자 private로 변경하자
 * private 생성자 덕분에 ClassGrade의 인스턴스 생성은 클래스 내부에서만 가능하다
 * ClassGrade 인스턴스를 사용할 때는 ClassGrade내부에 정의한 상수를 사용해야 한다
 */