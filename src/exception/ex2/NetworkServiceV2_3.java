package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        
        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        
    }
}
/**
 * 자바의 예외 처리 매커니즘과 try, catch 구조 덕분에 정상 흐름은 try 블럭에 모아서 처리하고,
 * 예외흐름은 catch 블럭에 별도로 모아서 처리할 수 있다
 * 덕분에 정상 흐름과 예외 흐름을 명확하게 분리해서 코드를 더 쉽게 읽을 수 있다
 * 
 * 남은 문제
 *  - 사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다 
 */