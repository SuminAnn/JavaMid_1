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
/*
 * 자바에서 많이 사용되는 String 클래스가 불변 객체이다. 뿐만 아니라 기본으로 제공하는 Integer, LocalDate등 수많은 클래스가 불변으로 설계되어 있다
 * 
 * 가변클래스가 더 일반적이고, 불변 클래스는 값을 변경하면 안되는 특별한 경우에 만들어서 사용한다
 * 
 * 클래스를 불변으로 설계하는 이유
 *  - 캐시 안정성
 *  - 멀티 쓰레드 안정성
 *  - 엔티티의 값 타입
 * 
 */
