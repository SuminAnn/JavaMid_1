package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();

        Object[] objs = {dog, car, obj};
        size(objs);
    }

    private static void size(Object[] objs){
        System.out.println("전달된 객체의 수 : " + objs.length);
    }
}
/*
 * Object가 없다면 모든 객체를 받을 수 있는 메서드와 배열을 만들 수 없다
 * 물론 없어도 직접 클래스를 만들고 모든 클래스에서 정의한 클래스를 상속 받으면 된다
 * 하지만 모든 개발자가 비슷한 클래스를 만들 것이고, 서로 호환되지 않는 수 많은 클래스들이 넘쳐날 것이다
 */
