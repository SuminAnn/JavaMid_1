package nested.annonymous.ex;
import java.util.*;;

public class Ex1RefMainV1 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");

        
        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위: " + randomValue);
        }
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for(int i=0; i<3; i++){
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

}
/*
 * 데이터를 메서드에 전달하는 경우 String, int와 같은 각 데이터에 맞는 타입을 전달하면 된다
 * 코드 조각을 메서드에 전달할 때는 인스턴스를 전달하고 해당 인스턴스에 있는 메서드를 호출하면 된다
 */