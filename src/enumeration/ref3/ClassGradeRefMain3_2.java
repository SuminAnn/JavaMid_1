package enumeration.ref3;

public class ClassGradeRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
        
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 할인금액 : " + grade.discount(price));
    }
}
