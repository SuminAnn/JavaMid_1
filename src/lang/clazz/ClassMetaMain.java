package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception{
        //Class 조회
        Class<String> clazz = String.class; //클래스에서 조회
        //Class clazz = new String().getClass(); 인스턴스에서 조회
        //Class clazz = Class.forName("java.lang.String"); 문자열로 조회

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래스 정보 출력
        System.out.println("Superclass : " + clazz.getSuperclass());

        //인터페이스 정보 출력
        Class[] iterface = clazz.getInterfaces();
        for (Class class1 : iterface) {
            System.out.println("interface : " + class1);
        }
    }
}
/*
 * 자바에서 Class 클래스는 클래스의 정보(메타데이터)를 다루는데 사용한다
 * Class 클래스를 통해 실행중인 자바 애플리케이션 내에서 필요한 클래스의 속성과 메소드에 대한 정보를 조회하고 조작할 수 있다
 * 
 * Class 클래스
 *  - 타입 정보 얻기 : 클래스 이름, 슈퍼클래스, 인터페이스, 접근 제한자 등과 같은 정보 조회
 *  - 리플랙션 : 클래스에 정의된 메소드, 필드, 생성자 등 조회, 이들을 통해 인스턴스 생성 메소드 호출
 *  - 동적 로딩과 생성 : Class.forName() 메서드를 사용하여 클래스를 동적으로 로드, newInstance()메서드를 통해 새로운 인스턴스 생성
 *  - 어노테이션 처리 : 클래스에 적용된 어노테이션을 조회하고 처리
 */