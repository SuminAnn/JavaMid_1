package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static int findValue(int[] intArr, int target){
        for (int i : intArr) {
            if(i == target){
                return i;
            }
        }
        return -1;
    }
}
/*
 * 기본형은 항상 값을 가져야 한다
 * 하지만 null값이 필요한 경우들이 있다
 */
