package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue){
        return new ImmutableObj(value + addValue);
    }


    @Override
    public String toString() {
        return "ImmutableObj [value=" + value + "]";
    }

    
}
/*
 * 불변 객체는 값을 변경하면 안된다
 * add메서드에서 새로운 객체를 생성해 줌으로서 불변객체는 기존 값은 변경하지 않고 계산 결과를 변경 할 수 있다
 * 이렇게 하면 불변도 유지하면서 새로운 결과도 만들 수 있다
 */
