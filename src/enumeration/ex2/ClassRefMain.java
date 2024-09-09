package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
/*
 * 각각의 상수는 ClassGrade타입을 기반으로 인스턴스 생성
 * 각각 다른 인스턴슬르 참조하기 때문에 참조값이 다르게 출력된다
 * 
 * static이므로 애플리케이션 로딩 시점에 3개의 ClassGrade 인스턴스가 생성되고,
 * 각각의 상수는 같은 ClassGrade타입의 서로 다른 인스턴스 참조값을 가진다
 */