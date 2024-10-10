package nested.test;

public class OuterClass3 {
    //여기에 지역 클래스 LocalClass 구현해라, 그리고 hello() 메서드를 만들어라
    public void myMethod(){
        class LocalClass {
            public void hello(){
                System.out.println("LocalClass.hello");
            }    
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
    
}
