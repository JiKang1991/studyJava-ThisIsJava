package classTutorial;
/**
 * �ܺο��� �޼ҵ带 ȣ���ϴ� ��ü�� �޼ҵ带 ȣ���ϴ� ����
 * @author jikang
 *
 */
public class CarCallMethodOutClassExample {
	public static void main(String[] args) {
		CarCallMethodOutClass myCar = new CarCallMethodOutClass();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ� : " + speed + "km/h");
	}
}
