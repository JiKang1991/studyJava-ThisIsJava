package polymorphismOfField;
/**
 * 인터페이스를 이용하여 필드의 다형성을 확인하는 예제(사용 클래스)
 * @author jikang
 *
 */
public class Car {
	
	// field
	// 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire frontLeftTire = new HTire();
	Tire frontRightTire = new HTire();
	Tire backLeftTire = new HTire();
	Tire backRightTire = new HTire();
	
	// method
	// 인터페이스에서 설명된 roll() 메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
