package lang.object.equals;

public class Userv2 {

    private String id;

    public Userv2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Userv2 other = (Userv2) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     Userv2 user = (Userv2) obj;
    //     return id.equals(user.id);
    // }

    
}
/*
 * 위 equals는 간단히 재정의한 버전이고, 실제로 정확하게 동작하도록 재정의 하는 것은 쉽지않다
 * 대부분 IDE는 정확한 equals()를 자동으로 만들어준다
 * 
 * equals()메서드를 구현할 때 지켜야 하는 규칙
 *  - 반사성 : 객체는 자기 자신과 동등해야 한다
 *  - 대창성 : 두 객체가 서로 동일하다고 판단하면 이는 양방향으로 동일해야 한다
 *  - 추이성 : A와 B 객체가 동일하고, B와 C 객체가 동일하면 A와 C도 동일해야한다
 *  - 일관성 : 객체의 상태가 변경되지 않는 한 항상 동일한 값을 반환해야 한다
 *  - null에 대한 비교
 */
