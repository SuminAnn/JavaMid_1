package exception.basic.unchecked;

/**
 * RuntimeException을 상속받은 예외는 언체크 예외가 된다
 */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message){
        super(message);
    }
}
/*
 * RuntimeException과 그 하위 예외는 언체크 예외로 분류된다
 * 언체크 예외는 말 그대로 컴파일러가 예외를 체크하지 않는다
 * 언체크 예외는 체크 예외와 기본적으로 동일하다 차이가 있다면 예외를 던지는 throws를 선언하지 않고 생략할 수 있다
 * 
 * 체크 예외 VS 언체크 예외
 *  - 체크 예외 : 예외를 잡아서 처리하지 않으면 항상 throws 키워드를 사용해서 던지는 예외를 선언해야 한다
 *  - 언체크 예외 : 예외를 잡아서 처리하지 않아도 throws 키워드를 생략할 수 있다
 */