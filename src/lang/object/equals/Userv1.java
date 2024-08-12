package lang.object.equals;

public class Userv1 {

    private String id;

    public Userv1(String id) {
        this.id = id;
    }

    
}
/*
 * 자바는 두 객체가 같다라는 표현을 2가지로 분리해서 제공한다
 *  - 동일성 : ==연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
 *  - 동등성 : equals()메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
 */
