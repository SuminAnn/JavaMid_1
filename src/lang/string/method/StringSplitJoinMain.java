package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] split = str.split(",");
        for (String string : split) {
            System.out.println(string);
        }

        String joinstr = String.join("-", split);
        System.out.println(joinstr);
    }
}
