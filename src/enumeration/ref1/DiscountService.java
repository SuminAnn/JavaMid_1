package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
/*
 * 기존에 있던 if문이 완전히 제거됐다
 */