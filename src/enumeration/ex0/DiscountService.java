package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price){
        int discountPercent = 0;

        if(grade.equals("BASIC")){
            discountPercent = 10;
        }else if(grade.equals("GOLD")){
            discountPercent = 20;
        }else if(grade.equals("DIAMOND")){
            discountPercent = 30;
        }else{
            System.out.println(grade + ": 할인X");
        }

        return price * discountPercent / 100;
    }
}
/*
 * 등급에 문자열을 사용하는 경우 문제가 발생할 수 있다
 *  - 존재하지 않는 등급을 입력한다
 *  - 오타
 *  - 대소문자 잘못 입력
 * 
 * 등급에 문자열 사용하는 경우
 *  - 타입 안전성 부족
 *   - 값의 제한 부족
 *   - 컴파일 시 오류 감지 불가, 런타임 시에만 감지되기 때문에 디버깅이 어렵다
 *  - 데이터 일관성
 */