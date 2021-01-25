package inheritance;
/**
 * �ʵ��� ������ ���� ����
 * @author jikang
 *
 */
public class PolymorphismOfFieldCar {
	// field
	// 4���� Ÿ�̾�
	PolymorphismOfFieldTire frontLeftTire = new PolymorphismOfFieldTire("������", 6);
	PolymorphismOfFieldTire frontRightTire = new PolymorphismOfFieldTire("�տ���", 2);
	PolymorphismOfFieldTire backLeftTire = new PolymorphismOfFieldTire("������", 3);
	PolymorphismOfFieldTire backRightTire = new PolymorphismOfFieldTire("�ڿ���", 4);
	
	// constructor
	
	// method
	// ��ũ ������ �����ϴ� �޼ҵ�
	void stop() {
		System.out.println("[�ڵ��� ����]");
	}
	
	// ��� Ÿ�̾ 1ȸ ȸ����Ű�� ���� �� Tire ��ü�� roll()�޼ҵ带 ȣ���Ѵ�.
	// false�� �����ϴ� roll�� ���� ��� stop() �޼ҵ带 ȣ���ϰ� �ش� Ÿ�̾� ��ȣ�� �����Ѵ�.
	int run() {
		System.out.println("[�ڵ��� ������.]");
		if(frontLeftTire.roll() == false) { stop();	return 1; }
		if(frontRightTire.roll() == false) { stop(); return 2; }
		if(backLeftTire.roll() == false) { stop(); return 3; }
		if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
	}
}
