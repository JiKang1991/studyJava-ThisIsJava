package inheritance;
/**
 * �ʵ��� ������ ���� ����(���� Ŭ����)
 * @author jikang
 *
 */
public class PolymorphismOfFieldCarRuntime {
	public static void main(String[] args) {
		// PolymorphismOfFieldCar ��ü ����
		PolymorphismOfFieldCar car = new PolymorphismOfFieldCar();		
		
		// PolymorphismOfFieldCar��ü�� run() �޼ҵ� 5�� ����
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			// ������ Ÿ�̾ ��ũ ���� �� HTire�� ��ü
			case 1:
				System.out.println("������ HTire�� ��ü");
				car.frontLeftTire = new PolymorphismOfFieldHTire("������", 15);
				break;
			// �տ��� Ÿ�̾ ��ũ ���� �� KTire�� ��ü
			case 2:
				System.out.println("�տ��� KTire�� ��ü");
				car.frontRightTire = new PolymorphismOfFieldKTire("�տ���", 13);
				break;
			// ������ Ÿ�̾ ��ũ ���� �� HTire�� ��ü
			case 3:
				System.out.println("������ HTire�� ��ü");
				car.backLeftTire = new PolymorphismOfFieldHTire("������", 14);
				break;
			// �ڿ��� Ÿ�̾ ��ũ ���� �� KTire�� ��ü
			case 4:
				System.out.println("�ڿ��� KTire�� ��ü");
				car.backRightTire = new PolymorphismOfFieldKTire("�ڿ���", 17);
				break;
			}
		}
		
	}
}
