package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] parts = fruits.split(",");

        for (String string : parts) {
            System.out.println(string);
        }

        System.out.println("joinedString = " + String.join("->", parts));
    }
}
