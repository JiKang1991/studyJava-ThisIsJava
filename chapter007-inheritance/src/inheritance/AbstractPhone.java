package inheritance;
/**
 * 추상 클래스 선언 예제 (부모 클래스, 추상 클래스)
 * @author jikang
 *
 */
public class AbstractPhone {
	// field
	public String owner;
	
	// constructor
	public AbstractPhone(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
