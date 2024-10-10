package nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        //여기에서 Hello 익명 클래스를 생성하고 hello() 호출
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Anonymous.hello");
            }
            
        };
        hello.hello();
    }
}
