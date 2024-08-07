package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object obj = new Object();
        String str = obj.toString();

        //toString 변환값 출력
        System.out.println(str);

        //obj 직접 출력
        System.out.println(obj);
    }
}
/*
 * toString()은 객체의 정보를 문자열 형태로 제공한다
 *  - 디버깅과 로깅에 유용하게 사용된다
 *  - 패키지를 포함한 객체의 이름과 객체의 참조값(해시코드)를 16진수로 제공한다
 *    -> 위 정보만으로는 객체의 상태를 적절히 나타내지 못한다. 그래서 보통 toString()을 재정의(오버라이딩)한다
 */
