package inheritance;
/**
 * 추상 클래스 선언 예제 (실행 클래스)
 * @author jikang
 *
 */
public class AbstractPhoneRuntime {
	public static void main(String[] args) {
		// AbstractPhone = new AbstractPhone();			// 추상클래스는 new 생성자로 객체 생성 할 수 없다
		
		AbstractSmartPhone smartPhone = new AbstractSmartPhone("월리");
		
		smartPhone.turnOn();		// 추상클래스 AbstractPhone의 메소드
		smartPhone.internetSerch();
		smartPhone.turnOff();		// 추상클래스 AbstractPhone의 메소드
	}
}
