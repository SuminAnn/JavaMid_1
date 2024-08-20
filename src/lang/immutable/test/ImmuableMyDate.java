package lang.immutable.test;

public class ImmuableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public ImmuableMyDate withYear(int newYear){
        return new ImmuableMyDate(newYear, month, day);
    } //기존 값은 유지하면서 새로운 객체를 반환하는 경우 with라는 표현을 관용적으로 사용한다

    public ImmuableMyDate withMonth(int newMonth){
        return new ImmuableMyDate(year, newMonth, day);
    }

    public ImmuableMyDate withDay(int newDay){
        return new ImmuableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return "ImmuableMyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
    }

}
/*
 * 불변 객체에서 값을 변경하는 경우 with로 시작하는 경우가 많다
 * 불변 객체의 메서드가 with로 이름 지어진 경우, 그 메서드가 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환한다
 * 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정 
 */
