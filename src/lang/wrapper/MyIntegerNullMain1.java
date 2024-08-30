package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target){
        for (MyInteger i : intArr) {
            if(i.getValue() == target){
                return i;
            }
        }
        return null;
    }
}
/*
 * 객체의 참조형은 값이 없다는 null을 사용할 수 있따
 * 물론 null 값을 반환하는 경우 exception이 발생할 수 있기 때문에 주의해서 사용해야 한다
 */