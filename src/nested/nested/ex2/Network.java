package nested.nested.ex2;

public class Network {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {


        private String content;
    
        public NetworkMessage(String content) {
            this.content = content;
        }
    
        public void print(){
            System.out.println(content);
        }
    }
}
/*
 * NetworkMessage는 중첩 클래스에 private 접근 제어자로 되어 있기 때문에 Network 내부에서만 사용하는 클래스
 * 중첩 내부 클래스가 외부에서 직접적으로 사용되는 경우에는 따로 빼서 클래스로 만드는 것이 좋다
 */