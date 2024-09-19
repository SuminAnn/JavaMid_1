package time;

import java.time.*;
public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2014, 1, 8);

        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + ofDate);
    }
}
/*
 * LocalDate : 날짜 표기, 년/월/일을 다룬다
 * LocalTime : 시간만을 표기, 시/분/초를 다룬다
 * LocalDateTime : LocalDate와 LocalTime을 합친 개념
 * 
 * Local은 세계 시간대를 고려하지 않고 특정 지역의 날짜와 시간만 교려할 때 사용한다
 * 
 * 모든 날짜 클래스는 불변이다. 변경이 발생하는 경우 객체를 통해 반환값을 받아야한다
 */