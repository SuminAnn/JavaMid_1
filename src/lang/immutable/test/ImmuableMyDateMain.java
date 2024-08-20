package lang.immutable.test;

public class ImmuableMyDateMain {

    public static void main(String[] args) {
        ImmuableMyDate date = new ImmuableMyDate(2024, 8, 20);
        ImmuableMyDate newDate = date;
        System.out.println("date : " + date);
        System.out.println("newDate : " + newDate);

        
        newDate = newDate.withDay(21);

        System.out.println("date : " + date);
        System.out.println("newDate : " + newDate);
    }
}
