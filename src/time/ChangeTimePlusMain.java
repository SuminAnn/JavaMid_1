package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}
/*
 * 시간을 조회하고 조작하는 부분에서 TemporalAccessor.get(), Temporal.plus()와 같은 인터페이스를 통해 특정 구현 클래스와
 * 무관하게 일관성 있는 시간 조회, 조작이 가능하다
 * 덕분에 LocalDateTime, LocalDate, LocalTime, ZonedDateTime, Instant와 같은 수 많은 구현에 관계없이 일관성 있는 방법으로 시간을 조회 조작할 수 있다 
 */