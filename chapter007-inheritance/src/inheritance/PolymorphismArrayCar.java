package inheritance;
/**
 * �������� ���� ��ü�� �迭�� �����ϴ� ����
 * @author jikang
 *
 */
public class PolymorphismArrayCar {
	// field
	PolymorphismOfFieldTire[] tires = {
		new PolymorphismOfFieldTire("������", 6),
		new PolymorphismOfFieldTire("�տ���", 2),
		new PolymorphismOfFieldTire("������", 3),
		new PolymorphismOfFieldTire("�ڿ���", 4)
	};
	
	// method
	void stop() {
		System.out.println("[�ڵ��� ����]");
	}
	
	int run() {
		System.out.println("[�ڵ��� ������]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			} 
		}
		return 0;
	}
}
