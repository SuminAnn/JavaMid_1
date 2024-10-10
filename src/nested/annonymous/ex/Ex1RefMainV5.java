package nested.annonymous.ex;
import java.util.*;;

public class Ex1RefMainV5 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");

        
        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위: " + randomValue);
        });

        hello(() -> {
            for(int i=0; i<3; i++){
                System.out.println("i = " + i);
            }
        });
    }

}
/*
 * 람다(lamda)
 * 자바8 이전까지 메서드에 인수로 전달할 수 있는 것은 크게 2가지였다
 *  - int, double과 같은 기본형 타입
 *  - Process, Member와 같은 참조형 타입(인스턴스)
 * 
 * 지금처럼 코드 조각을 전달하기 위해 클래스를 정의하고 메서드를 만들고 인스턴스를 생성해서 전달해야 할까?
 * 메서드(더 정확히는 함수)를 인수로 전달하는 것을 '람다'라 한다
 */