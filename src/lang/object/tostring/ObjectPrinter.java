package lang.object.tostring;

public class ObjectPrinter {

    public static void print(Object obj){
        String str = "객체 정보 출력: " + obj.toString();
        System.out.println(str);
    } //static 메서드는 객체 생성 없이 바로 사용 가능하다
}
