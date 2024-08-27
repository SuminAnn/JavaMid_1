package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<100000; i++){
            sb.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();

        System.out.println(sb.toString());
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
/*
 * 문자열을 합칠 떄 대부분의 경우 최적화가 되므로 + 연산을 사용하면 된다
 * 
 * StringBuilder를 직접 사용하는 것이 더 좋은 경우
 *  - 반복문에서 반복해서 문자를 연결할 때
 *  - 조건문을 통해 동적으로 문자열을 조합할 때
 *  - 복잡한 문자열의 특정 부분을 변경해야 할 때
 *  - 매우 긴 대용량 문자열을 다룰 때
 */
