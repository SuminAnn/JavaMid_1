package lang.immutable.address;

public class ImmutableAddress {

    private final String address;

    public ImmutableAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ImmutableAddress [address=" + address + "]";
    }

    
}
/*
 * 객체를 공유한다고 바로 사이드 이펙트가 발생하지 않는다. 문제는 공유된 객체의 값을 변경한 것에 있다
 * 
 * 불변객체
 *  - 객체의 상태가 변하지 않는 객체
 *  - 단순한 제약을 사용해서 사이드 이펙트를 막을 수 있다
 * 
 * 변경이 있을경우 동시에 변경을 원하면 가변객체를 사용한다
 */
