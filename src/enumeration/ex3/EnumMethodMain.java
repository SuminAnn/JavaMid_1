package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        
        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade grade : values) {
            System.out.println("name = " + grade.name() + ", ordinal = " + grade.ordinal());
        }

        //String -> ENUM 변환, 잘못된 문자면 예외발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString() 오버라이딩 가능

    }
}
/*
 * ordinal()은 가급적 사용하지 않는 것이 좋다
 *  : 값을 사용하다가 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 모두 변경될 수 있기 때문이다
 *  : 예를들어 중간에 BASIC 다음에 SILVER 등급이 추가되는 경우 GOLD, DIAMOND의 값이 하나씩 추가된다
 * 
 * 열거형은 인터페이스를 구현할 수 있다
 * 열거형에 추상 메서드를 선언하고, 구현할 수 있다
 */