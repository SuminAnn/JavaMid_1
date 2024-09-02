package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000;//반복 횟수 설정, 10djr
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterations; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive : " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms"); //기본형은 0.3초

        //래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterations; i++){
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper : " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간 : " + (endTime - startTime) + "ms"); //래퍼클래스는 2.8초
    }
}
/*
 * 래퍼 클래스는 객체이기 때문에 기본형보다 다양한 기능을 제공한다
 * 그렇다면 기본형을 제공하는 이유는 무엇일까?
 * 
 * 기본형 연산이 래퍼 클래스보다 실행 결과가 빠른것을 확인할 수 있다
 *  - 기본형은 메모리에서 단순히 크기만큼의 공간을 차지한다
 *  - 래퍼 클래스의 인스턴스는 내부에서 필드로 가지고 있는 기본형의 값 뿐만 아니라 자바에서 객체 자체를 다루는데 필요한
 *    객체 메타데이터를 포함하므로 더 많은 메모리를 사용한다.
 * 
 * 일반적인 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화해도 사막의 모래알 하나 정도의 차이가 난다
 * CPU 연산을 아주 많이 수행하는 특수한 경우이거나, 수만~수십만 이상 연속해서 연산을 숭행해야 하는 경우라면 기본형을 사용해서 최적화를 고려하다
 * 그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은 것을 선택하면 된다
 * 
 * 웹 애플리케이션의 경우 메모리 안에서 발생하는 연산 하나보다 네트워크 호출 한 번이 많게는 수십만배 더 오래걸린다
 * 자바 메모리 내부에서 발생하는 연산을 수천번에서 한 번으로 줄이는 것 보다, 네트워크 호출 한 번을 더 줄이는 것이 더 효과적인 경우가 많다
 */