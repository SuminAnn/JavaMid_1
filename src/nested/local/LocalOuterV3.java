package nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();
    }
}
/*
 * 클래스 변수(메서드 영역)
 *  - 클래스 변수(static 변수)는 메서드 영역에 존재하고, 자바가 클래스 정보를 읽어 들이는 순간부터 프로그램 종료까지 존재
 * 인스턴스 변수(힙 영역)
 *  - 본인이 소속된 인스턴스가 GC되기 전까지 존재
 * 지역 변수(스택 영역)
 *  - 스택영역의 스택 프레임 안에 존재한다
 *  - 메서드가 호출되면 생성된고 메서드 호출이 종료되면 스택프레임이 제거되면서 그 안에 있는 지역변수도 모두 제거된다
 *  - 참고로 매개변수도 지역 변수의 한 종류이다
 */