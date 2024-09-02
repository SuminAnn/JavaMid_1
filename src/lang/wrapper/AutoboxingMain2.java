package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitve -> Wrapper
        int value = 9;
        Integer boxInteger = value; //오토 박싱

        //Wrapper -> Primitive
        int unboxedValue = boxInteger; //오토 언박싱

        System.out.println("boxInteger : " + boxInteger);
        System.out.println("unboxedValue : " + unboxedValue);
    }
}