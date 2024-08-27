package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).getValue(); //자기 자신의 참조값을 반환하기 때문에 즉시 참조해서 메서드 호출할 수 있다
        System.out.println(result);
    }
}
/*
 * 메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 반환된 참조값을 사용해서 메서드 호출이 가능하다
 * 이를 메서드 체이닝이라 한다
 * 
 * 기존에는 메서드를 호출할 때 마다 계속 변수명에 .을 찍어야 했다
 * 메서드 체이닝 방식은 메서드가 끝나는 시점에 바로 .을 찍어서 변수명을 생략할 수 있다
 * 메서드 체이닝이 가능한 이유는 자기 자신의 참조값을 반환하기 때문이다
 * 메서드 체이닝 기법은 코드를 간결하고 읽기 쉽게 만들어준다
 */
