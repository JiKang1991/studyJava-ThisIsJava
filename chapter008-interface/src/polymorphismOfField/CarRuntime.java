package polymorphismOfField;
/**
 * �������̽��� ����� �ʵ� ������ Ȯ�� ����(����Ŭ����)
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
