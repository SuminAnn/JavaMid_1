package exception.ex3.exception;

public class NetworkClientExceptionV3 extends Exception{
    public NetworkClientExceptionV3(String message){
        super(message);
    }
}
/*
 * 예외를 단순히 오류 코드로 분류하는 것이 아니라, 예외를 계층화해서 다양하게 만들면 더 세밀하게 예외를 처리할 수 있다
 * 
 * 예외를 계층화하면 장점
 *  - 부모 예외를 잡거나 던지면, 자식 예외도 함께 잡거나 던질 수 있다
 *  - 특정 예외를 잡아서 처리하고 싶으면 하위 예외를 잡아서 처리하면 된다
 */