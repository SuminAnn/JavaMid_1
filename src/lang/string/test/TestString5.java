package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int idx = str.indexOf(key);
        
        while (idx >= 0) {
            count++;
            idx = str.indexOf(key, idx+1);
        }

        System.out.println("count = " + count);
    }
}
