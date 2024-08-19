package lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void add(int addValue){
        value = value + addValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MutableObj [value=" + value + "]";
    }

    
}
/*
 * 불변 객체를 사용하지만 그래도 값을 변경해야 하는 경우
 *  - 기존 값에 새로운 값을 더하는 add()와 같은 메서드가 있다
 */
