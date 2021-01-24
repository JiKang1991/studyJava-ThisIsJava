package inheritance;
/**
 * 오버라이딩 된 부모 메소드를 super 키워드 사용하여 호출하는 예제(부모클래스)
 * @author jikang
 *
 */
public class CallSuperMethodAirplane {
	public void land() {
		System.out.println("착륙합니다.");
	}
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
