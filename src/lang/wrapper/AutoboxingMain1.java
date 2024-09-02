package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitve -> Wrapper
        int value = 9;
        Integer boxInteger = Integer.valueOf(value);

        //Wrapper -> Primitive
        int unboxedValue = boxInteger.intValue();

        System.out.println("boxInteger : " + boxInteger);
        System.out.println("unboxedValue : " + unboxedValue);
    }
}
/*
 * 오토박싱(Autoboxing)
 *  - 자바 5부터 오토 박싱, 오토 언박싱을 지원한다
 *  - 컴파일 단계에서 추가해준다
 */