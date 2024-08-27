package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";

        for(int i=0; i<100000; i++){
            result += "Hello Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println(result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
/*
 * 문자열 리터럴의 경우 더하는 부분을 컴파일 전에 자동으로 합쳐준다 -> 런타임에 별도의 연산을 수행하지 않기 떄문에 성능이 향상된다
 * 문자열 변수의 경우 컴파일 시점에서 합칠 수 없다. 이런 경우 StringBuilder를 사용하여 최적화를 수행한다
 *  -> 이렇듯 자바가 최적화를 해주기 때문에 간단한 경우 StringBuilder를 사용하지 않아도 된다, 연산(+)을 사용하면 충분하다
 * 
 * 단, 문자열을 Loop(반복문)안에서 더하는 경우에는 최적화가 이루어지지 않는다
 * 반복문의 내부에서 문자열 연결은 반복 횟수만큼 객체를 생성해야 한다
 * 
 */
