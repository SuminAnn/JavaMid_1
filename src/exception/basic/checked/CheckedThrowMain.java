package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.catchThrow();
        } catch (MyCheckedException e) {
           //예외 처리 로직
           System.out.println("예외 처리, message=" + e.getMessage());
        }
    }
}
/**
 * 체크 예외의 장단점
 * - 장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아주는 안전 장치
 *          이를 통해 개발자는 어떤 체크 예외가 발생하는지 쉽게 파악할 수 있다
 * - 단점 : 개발자가 모든 체크 예외를 반드시 잡거나 던지도록 처리해야 하기 때문에 번거롭다
 *          크게 신경쓰고 싶지 않은 예외까지 모두 처리해야 한다
 * 
 */