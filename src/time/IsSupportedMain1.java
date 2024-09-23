package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        //System.out.println(minute); LocalDate는 날짜 정보만 가지기 때문에 분에 대한 정보는 없다 -> 예외 발생
        //이런 문제를 예방하기 위해 현재 타입에서 특정 시간 단위나 필드를 사용할 수 있는지 확인하는 메서드 제공

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(supported);

        if(supported){
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println(minute);
        }
    }
}
