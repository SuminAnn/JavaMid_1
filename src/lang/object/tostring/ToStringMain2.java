package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 3);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
/*
 * 만약 Object가 없고 Object가 제공하는 toString()이 없다면 서로 관계가 없는 객체의 정보를 출력하기 어렵다
 * 여기서 서로 관계가 없다는 것은 공통의 부모가 없다는 뜻이다
 * 클래스가 늘어나면 그 수에 맞게 지속적으로 만들어줘야한다
 * 물론 Object와 비슷한 공통의 부모 클래스를 만들어서 해결할 수도 있다
 * 
 * 다형성을 잘 활용한다는 것은 다형적 참조와 메서드 오버라이딩을 적절하게 사용한다는 뜻이다
 *  - 다형적 참조 : Object 타입을 매개변수로 사용해서 다형적 참조를 사용, 모든 객체 인스턴스를 인수로 받을 수 있다
 *  - 매서드 오버라이딩 : Object는 모든 클래스의 부모이다. 따라서 Object가 가지고 있는 메서드를 오버라이딩 할 수 있다
 */
