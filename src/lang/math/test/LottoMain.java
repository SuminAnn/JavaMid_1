package lang.math.test;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();

        System.out.print("당첨 번호 : ");
        for (int i : lottoNumbers) {
            System.out.print(i + " ");
        }
    }
}
