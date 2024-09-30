package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("inner = " + inner.getClass());
    }
}
/*
 * 내부 클래스는 바깥 클래스의 인스턴스에 소속된다. 따라서 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다
 * 
 * 중첩 : 어떤 다른것이 내부에 위치하거나 포함되는 구조적인 관계 
 * 내부 : 나의 내부에 있는 나를 구성하는 요소
 */