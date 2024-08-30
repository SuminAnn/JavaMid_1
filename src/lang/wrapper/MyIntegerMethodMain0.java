package lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        
    }

    public static int compareTo(int value, int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else{
            return 0;
        }
    }
}
/*
 * 자바는 객체 지향 언어이다. 그런데 자바 안에 객체가 아닌 것이 있다
 * 바로 int, double 같은 기본형(Primitive Type)이다. 기본형은 객체가 아니기 때문에 한계가 있다
 *  - 객체 지향 프로그래밍의 장점을 살릴 수 없다. 예를들어 유용한 메서드를 제공할 수 없다
 *  - 객체 참조가 필요한 컬렉션 프레임워크를 사용할 수 없다. 그리고 제네릭도 사용할 수 없다
 *  - null 값을 가질 수 없다
 */
