package lang.immutable.test;

public class MyDateMain {

    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 8, 20);

        System.out.println("date : " + date);

        MyDate newDate = date;
        newDate.setDay(21);

        System.out.println("date : " + date);
        System.out.println("newDate : " + newDate);
    }
}
