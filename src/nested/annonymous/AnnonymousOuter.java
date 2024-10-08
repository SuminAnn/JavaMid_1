package nested.annonymous;

import nested.local.Printer;

public class AnnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        Printer printer = new Printer(){

            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        };
        printer.print();
    }

    public static void main(String[] args) {
        AnnonymousOuter main = new AnnonymousOuter();
        main.process(2);
    }
}
/*
 * 익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다
 * new 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 된다
 * 
 * 익명 클래스 특징
 *  - 이름 없는 지역 클래스를 선언하면서 동시에 생성한다
 *  - 부모 클래스를 상속 받거나, 인터페이스를 구현해야 한다
 *  - 이름을 가지지 않으므로, 생성자를 가질 수 없다(기본 생성자만 사용)
 *  - 단 한번만 인스턴스를 생성할 수 있다
 * 
 * 익명 클래스 장점
 *  - 별도로 정의하지 않고 인터페이스나 추상 클래스를 즉석에서 구현할 수 있어 코드가 간결해진다
 *    하지만 복잡하거나 재사용이 필요한 경우에는 별도의 클래스를 정의하는 것이 좋다
 */