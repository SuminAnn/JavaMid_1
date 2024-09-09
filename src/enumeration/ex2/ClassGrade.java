package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자 추가
    private ClassGrade(){}
}
/*
 * 타입 안전 열거형 패턴
 *  - 클래스 타입만 사용가능하게 제약을 두고, 사용 가능한 항목만 나열하는 제약을 두는 것
 *  - 나열한 항목만 사용할 수 있다 
 *  - 타입 안전성 향상 : 정해진 객체만 사용할 수 있기 떄문에 잘못된 값을 입력하는 문제를 방지
 *  - 데이터 일관성 : 정해진 객체만 사용하므로 데이터의 일관성이 보장된다
 *  - 제헌된 인스턴스 생성 : 클래스에 정의된 인스턴스만 생성하고 외부에서는 이 인스턴스들만 사용할 수 있도록 한다
 */