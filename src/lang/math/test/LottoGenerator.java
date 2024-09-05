package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int num = random.nextInt(45) + 1;
            if(isUnique(num)){
                lottoNumbers[count] = num;
                count++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int num){
        for (int i : lottoNumbers) {
            if(i == num){
                return false;
            }
        }
        return true;
    } //중복번호 검사
}
