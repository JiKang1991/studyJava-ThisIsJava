package polymorphismOfField;
/**
 * �������̽��� �̿��Ͽ� �ʵ��� �������� Ȯ���ϴ� ����(��� Ŭ����)
 * @author jikang
 *
 */
public class Car {
	
	// field
	// �������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	Tire frontLeftTire = new HTire();
	Tire frontRightTire = new HTire();
	Tire backLeftTire = new HTire();
	Tire backRightTire = new HTire();
	
	// method
	// �������̽����� ����� roll() �޼ҵ� ȣ��
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
