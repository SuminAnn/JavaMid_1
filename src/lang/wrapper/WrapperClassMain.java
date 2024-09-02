package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger : " + newInteger);
        System.out.println("integerObj : " + integerObj);
        System.out.println("longObj : " + longObj);
        System.out.println("doubleObj : " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue : " + intValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj)); //참조값이 달라서 false
        System.out.println("equals : " + (newInteger.equals(integerObj))); //내부 값이 같아서 true
    }
}
/*
 * 자바가 제공하는 기본 래퍼 클래스는 다음과 같은 특징이 있다
 *  - 불변이다
 *  - equals로 비교해야 한다
 * 
 * 박싱(Boxing)
 *  - 기본형을 래퍼 클래스로 변경
 *  - .valueOf()메서드를 활용
 * 
 * 언박싱(Unboxing)
 *  - 래퍼 클래스에 들어있는 기본형을 다시 꺼내는 메서드
 *  - intValue()
 * 
 */
