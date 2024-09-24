package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate starDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        Period between = Period.between(starDate, endDate);
        long dayBetween = ChronoUnit.DAYS.between(starDate, endDate);

        System.out.println("starDate = " + starDate);
        System.out.println("endDate = " + endDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "월 " + between.getDays() + "일");
        System.out.println("디데이: " + dayBetween + "일 남음");

    }
}
