package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;

        public void print(){
            //자기 자신에 접근
            System.out.println(innerInstanceValue);

            //외부 클래스 인스턴스 멤버에 접근, private도 접근 가능
            System.out.println(outInstanceValue);

            //외부 클래스의 클래스 멤버에 접근
            System.out.println(outClassValue);
        }
    }
}
/*
 * 내부 클래스는
 *  - 자신의 멤버에 접근 가능
 *  - 바깥 클래스의 인스턴스 멤버에 접근 가능
 *  - 바깥 클래스의 클래스 멤버에 접근 가능
 */