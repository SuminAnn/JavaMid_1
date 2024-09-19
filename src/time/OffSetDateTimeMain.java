package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffSetDateTimeMain {

    public static void main(String[] args) {
        OffsetTime nowOdt = OffsetTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
/*
 * ZonedDateTime은 구체적인 지역 시간대를 다룰 때 사용, 사용자 지정 시간대에 따른 시간 계산이 필요할 때 적합
 * OffsetDateTime은 UTC와의 시간 차이만을 나타낼 때 사용, 시간대 변환 없이 로그를 기록하고, 데이터 저장하고 처리할 때 적합
 */