package nested.annonymous.ex;

public class Ex0RefMain {
    public static void hello(String str){
        System.out.println("프로그램 시작");
        System.out.println("Hello " + str);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
// 변하는 부분을 메서드(함수) 내부에서 가지고 있는 것이 아니라, 외부에서 전달받는 것