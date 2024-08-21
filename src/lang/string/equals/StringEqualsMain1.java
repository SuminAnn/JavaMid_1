package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 : " + (str1 == str2)); //참조값이 다르기 때문에 false
        System.out.println("new String() equals() 비교 : " + str1.equals(str2)); //byte[]을 비교

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교 : " + (str3 == str4)); //같은 문자열 이기 때문에 문자열 풀에 인스턴스를 만들지 않는다 true
        System.out.println("리터럴 equals() 비교 : " + str3.equals(str4)); //byte[]을 비교
    }
}
/*
 * String 클래스 비교할 때는 ==비교가 아니라 항상 equals()비교를 해야한다
 *  - 동일성(Identity) : ==연산자를 사용해서 두 객체의 참조가 동일한 개체를 가리키고 있는지 확인
 *  - 동등성(Equality) : equals() 메서드를 사용하여 두 객체가 논리적으로 같은지 확인
 * 
 * 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다
 * 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둔다. 이때 같은 문자열이 있으면 만들지 않는다
 * 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다
 * 
 * 풀(pool) : 공용 자원을 모아둔 곳
 *  - 문자열 풀은 힙 영역을 사용한다
 *  - 해시 알고리즘을 사용하기 때문에 매우 빠른 속도로 인스턴스를 찾을 수 있다
 */
