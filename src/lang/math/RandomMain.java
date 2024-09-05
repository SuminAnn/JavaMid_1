package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1); // seed가 같으면 Random의 결과가 같다

        int randomInt = random.nextInt();
        System.out.println("randomInt : " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble : " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean : " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9사이
        System.out.println("randomRange1 : " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; //1 ~ 10사이
        System.out.println("randomRange2 : " + randomRange2);
    }
}
/*
 * seed 값을 직접 사용하면 결과 값이 항상 같기 때문에 결과가 달라지는 갠덤 값을 구할 수 없다
 * 하지만 테스트 코드 같은 곳에서 같은 결과를 검증할 수 있다
 */