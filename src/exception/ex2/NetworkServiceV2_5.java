package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        
        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally{
            client.disconnect();
        }
        
    }
}
/**
 * 자바는 어떤 경우라도 반드시 호출되는 finally 기능을 제공한다
 * try ~ catch ~ finally 구조는 정상흐름, 예외 흐름, 마무리 흐름을 제공한다
 * try를 시작하기만 하면, finally 코드 블럭은 어떤 경우라도 반드시 호출된다
 * 심지어 try, catch 안에서 잡을 수 없는 예외가 발생해도 finally는 반드시 호출된다
 */