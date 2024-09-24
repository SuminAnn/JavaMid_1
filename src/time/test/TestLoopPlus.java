package time.test;

import java.time.LocalDate;

public class TestLoopPlus {

    public static void main(String[] args) {
     LocalDate startDate = LocalDate.of(2024, 01, 01);

     for(int i=0; i<5; i++){
        LocalDate nextWeeks = startDate.plusWeeks(2*i);
        System.out.println("nextWeeks = " + nextWeeks);
     }
    }
}
