package lang.math;

public class MathMain {

    public static void main(String[] args) {
        // 기본 연산
        System.out.println("max : " + Math.max(10, 20));
        System.out.println("min : " + Math.min(10, 20));
        System.out.println("abs : " + Math.abs(-10));

        // 반올림 및 정밀도
        System.out.println("ceil : " + Math.ceil(2.1));
        System.out.println("floor : " + Math.floor(2.1));
        System.out.println("round : " + Math.round(2.5));

        // 기타
        System.out.println("sqrt : " + Math.sqrt(4));
        System.out.println("random : " + Math.random()); //0.0 ~ 1.0 사이의 double값
    }
}
/*
 * 아주 정밀한 숫자와 반올림 계산이 필요하다면 BigDecimal을 사용한다
 */