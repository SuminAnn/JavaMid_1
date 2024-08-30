package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "MyInteger [value=" + value + "]";
    }
 
}
/*
 * MyInteger는 int value라는 기본형 변수를 가진다
 * 기본형 변수를 편리하게 사용하도록 다양한 메서드를 제공한다
 * compareTo()메서드를 클래스 내부로 캡슐화 했다
 * 불변으로 설계
 */
