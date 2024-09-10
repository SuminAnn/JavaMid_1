package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
/*
 * 생성자를 통해서만 discountPercent를 설정 가능
 * 중간에 값이 변하지 않도록 불변으로 설계
 * 상수를 정의할 때 각각의 등급에 따른 할인율이 정해진다
 */