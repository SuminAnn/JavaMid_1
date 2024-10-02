package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter{
            int value = 0;

            public void printData(){
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
/*
 * 지역 클래스는 내부 클래스의 특별한 종류의 하나이다
 * 지역 클래스도 내부 클래스이므로 바깥 클래스의 인스턴스 멤버에 접근 가능하다
 * 지역 클래스는 지역 변수와 같은 코드 블럭 안에서 정의된다
 * 지역 클래스는 지역 변수처럼 접근 제어자를 사용할 수 없다
 */