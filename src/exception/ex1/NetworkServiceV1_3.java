package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);
        
        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        }else{
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String dataString){
        return !dataString.equals("success");
    }
}
/*
 * 자바의 경우 GC가 있기 떄문에 JVM 메모리에 있는 인스턴스는 자동으로 해제할 수 있다
 * 하지만 외부 연결과 같은 자바 외부의 자원은 자동으로 해체가 되지 않는다
 * 따라서 외부 자원을 사용한 후에 연결을 해제해서 외부 자원을 반드시 반납해야 한다
 * 
 * 정상 흐름과 예외 흐름이 섞여 있기 떄문에 코드를 한눈에 이해하기 어렵다
 */