package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDate = now.format(formatter);
        System.out.println("formatDate = " + formatDate);
        System.out.println("now = " + now);

        //파싱
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parseDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parseDateTime = " + parseDateTime);
    }
}
