package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

    }
}
/*
 * String은 클래스다. int, boolean 같은 기본형이 아니라 참조형이다
 * 문자열은 자주 사용되기 때문에 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 new String()과 같이 변경해서 객체를 생성해준다
 * (이 경우 실제로는 성능 최적화를 위해 문자열 풀을 사용한다)
 * String은 참조형이기 때문에 +연산을 사용할 수 없다. 하지만 문자열은 자주 다루어지기 때문에 자바 언어에서 편의상 +연산을 제공한다
 */