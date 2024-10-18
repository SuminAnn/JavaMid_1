package exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
/**
 * 언체크 예외
 *  - 장점 : 언체크 예외는 throws 예외를 생략 가능
 *  - 단점 : 개발자가 실수로 예외를 누락할 수 있다 체크 예외는 컴파일러가 예외 누락을 잡아준다
 */