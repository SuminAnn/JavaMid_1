package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 01, 01, 0, 0, 0);
        LocalDateTime changeDate = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기존 시간: " + dateTime);
        System.out.println("변경 시간: " + changeDate);
    }
}
