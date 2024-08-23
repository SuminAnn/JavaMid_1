package lang.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        //str.concat(" java"); 이 경우에 str을 출력하면 hello java가 아닌 hello가 출력된다
        String str1 = str.concat(" java");
        System.out.println("str : " + str);
        System.out.println("str1 : " + str1);
    }
}
/*
 * String은 불변객체이다 생성 이후에는 절대로 내부의 문자열 값을 변경 할 수 없다
 * 변경이 필요한 경우 기존 값을 변경하지 않고 새로운 결과를 만들어서 반환한다
 * 
 * String이 불변으로 설계된 이유
 *  - 문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함께 변경된다
 */