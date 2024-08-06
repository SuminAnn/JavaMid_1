package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.ParentMehtod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}
/*
 * Child를 생성을 하면 부모 클래스인 Parent와 Parent가 묵시정 상속을 받은 Object클래스 모두 메모리에도 함께 생성된다
 * 
 * 모든 클래스가 Object 클래스를 상속 받는 이유
 *  - 공통 기능 제공
 *    -> 프로그래밍이 단순화되고, 일관성을 가진다
 *  - 다형성의 기본 구현
 *    -> Object는 모든 객체를 참조할 수 있다
 */
