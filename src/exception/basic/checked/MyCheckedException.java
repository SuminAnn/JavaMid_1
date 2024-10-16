package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다
 */
public class MyCheckedException extends Exception{

    public MyCheckedException(String message){
        super(message);
    }
}
/*
 * Throwable : 최상위 예외, 하위에는 Exception, Error이 있다
 * Error : 메모리 부족이나 심각한 시스템 오류와 같이 애플리케이션에서 복구가 불가한 시스템 예외
 * Exception : 체크 예외
 *  - 애플리케이션 로직에서 사용할 수 있는 실질적인 최상위 예외
 *  - Exception과 그 하위 예외는 모두 컴파일러가 체크하는 체크 예외, 단 RuntimeException은 예외로 한다
 * RuntimeException : 언체크 예외, 런타임 예외
 *  - 컴파일러가 체크하지 않는 언체크 예외
 * 
 * 체크 예외 VS 언체크 예외
 * 체크 예외는 발생한 예외를 개발자가 명시적으로 처리해야 한다 그렇지 않으면 컴파일 오류가 발생
 * 언체크 예외는 개발자가 발생한 예외를 명시적으로 처리하지 않아도 된다
 * 
 * 예외의 기본 규칙
 *  - 예외는 잡아서 처리하거나 밖으로 던져야 한다
 *  - 예외를 잡거나 던질 떄 지정한 예외뿐만 아니라 그 예외의 자식들도 함께 처리할 수 있다
 *    - 예를 들어 Exception을 catch로 잡으면 그 하위 예외들도 모두 잡을 수 있다
 *    - 예를 들어 Exception을 throws로 던지면 그 하위 예외들도 모두 던질 수 있다
 *      -> 자바 main() 밖으로 예외를 던지면 예외 로그를 출력하면서 시스템이 종료된다 
 */