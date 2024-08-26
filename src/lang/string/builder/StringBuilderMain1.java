package lang.string.builder;

public class StringBuilderMain1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(4, "Java");
        System.out.println(sb);

        sb.delete(4, 8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //StringBuilder(가변) -> String(불변)
        String str = sb.toString();
        System.out.println(str);
    }
}
/*
 * 불변인 String 클래스의 단점
 *  - 불변인 String의 내부 값은 변경할 수 없다. 변경된 값을 기반으로 새로운 String 객체를 생성한다
 *  - 문자를 더하거나 변경할 때 마다 계속해서 새로운 객체를 생성해야 한다
 *  - 결과적으로 자원을 더 많이 사용하게 된다
 * -> 실제로는 문자열을 다룰 때 자바가 내부에서 최적화를 한다
 * 
 * StringBuilder (가변 String을 제공) -> 단 사이드 이펙트에 주의해서 사용해야한다
 * 
 * 가변 VS 불변
 *  - String은 불변, 즉 한번 생성되면 그 내용을 변경할 수 없다. 변경을 할 때마다 새로운 String 객체가 생성되고, 기존 객체는 버려진다. 이 과정에서 메모리와 처리 시간을 더 많이 소모한다
 *  - StringBuilder은 가변, 객체 안에서 문자열을 추가, 삭제, 수정할 수 있으며 이때마다 새로운 객체를 생성하지 않는다. 이로인해 성능을 향상시킬 수 있다. 단 사이드 이펙트를 주의해야한다
 * -> StringBuilder는 문자열을 변경하는 동안 사용하다가 변경이 끝나면 안전한 String(불변객체)로 변환하는 것이 좋다
 */
