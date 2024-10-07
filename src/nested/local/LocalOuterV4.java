package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

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
        // 만약 localVar의 값을 변경한다면
        // localVar = 10;
        // paramVar = 20;
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
/*
 * 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안된다
 * 따라서 final로 선언하거나 사실상 final이어야 한다
 * 
 * 사실상 final
 *  - 지역 변수에 final 키워드를 사용하지는 않았지만, 값을 변경하지 않는 지역 변수를 뜻한다
 * 
 * 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다
 */