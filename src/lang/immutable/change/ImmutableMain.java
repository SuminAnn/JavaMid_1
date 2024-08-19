package lang.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj obj2 = obj.add(20); //불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 반환값을 받아야 한다

        //add이후에 기존값과 계산 결과 값 모두 확인 가능
        System.out.println("obj : " + obj);
        System.out.println("obj2 : " + obj2);
    }
}
