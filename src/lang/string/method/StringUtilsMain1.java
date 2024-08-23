package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numString);

        String numString2 = "" + num; //문자 + x -> 문자
        System.out.println("빈문자열 + num : " + numString2);

        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
