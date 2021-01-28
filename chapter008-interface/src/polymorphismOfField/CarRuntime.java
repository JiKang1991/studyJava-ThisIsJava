package polymorphismOfField;
/**
 * 인터페이스를 사용한 필드 다형성 확인 예제(실행클래스)
 * @author jikang
 *
 */
public class CarRuntime {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KTire();
		myCar.frontRightTire = new KTire();
		
		myCar.run();
	}
}
