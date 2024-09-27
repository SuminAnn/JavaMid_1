package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
/*
 * 정적 중첩 클래스는 new 바깥클래스.중첩클래스()로 생성할 수 있다
 * 중첩클래스는 바깥클래스.중첩클래스로 접근할 수 있다
 * 바깥클래스의 인스턴스와 정적 중첩 클래스의 인스턴스는 서로 아무 관계가 없는 인스턴스이다
 * 단지 클래스 구조상 중첩해 두었을 뿐이다
 * 정적 중첩 클래스의 인스턴스만 따로 생성해도 된다
 */