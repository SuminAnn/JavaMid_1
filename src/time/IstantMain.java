package time;

import java.time.*;;
public class IstantMain {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(100);
        System.out.println("epochStart = " + epochStart);
    }
}
/*
 * 전 세계적인 시간 기준 필요 시 : Instant는 UTC를 기준으로 하기 때문에
 * 시간대 변환 없이 시간 계산 필요 시 : 시간대의 변화 없이 순수하게 시간의 흐름만을 다루고 싶을 때
 * 데이터 저장 및 교환 : DB에 날짜와 시간 정보를 저장하거나 다른 시스템과 날짜와 시간 정보를 교환할 때
 * 
 * 단 Instant는 날짜 계산이 어렵기 떄문에 글로벌 서비스가 아닌 경우에는 사용하지 않는게 좋다
 */