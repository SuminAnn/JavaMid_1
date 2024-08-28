package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        
        int index = str.indexOf(ext);
        String fileName = str.substring(0, index);
        String extName = str.substring(index);
        System.out.println("filename : " + fileName);
        System.out.println("extName : " + extName);
    }
}
