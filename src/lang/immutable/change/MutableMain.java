package lang.immutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        //add이후에는 기존 값은 사라진다
        System.out.println("obj : " + obj);
    }
}
