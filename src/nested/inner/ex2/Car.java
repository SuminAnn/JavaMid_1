package nested.inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine{

        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다");
        }
    }
}
/*
 * 리팩토링 전에는 모델 이름과 충전 레벨을 외부에 노출함으로써 캡슐화를 떨어뜨린다
 * 
 * 중첩 클래스는 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀하게 연결되어 있는 특별한 경우에 사용
 * 중첩클래스 사용 이유
 *  - 논리적 그룹화
 *  - 캡슐화
 */