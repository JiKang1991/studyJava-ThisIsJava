package classTutorial;
/**
 * �ν��Ͻ� ����� this�� Ȱ���� ��ü ȣ�� ����
 * @author jikang
 *
 */
public class CarInstanceMemberAndThisExample {
	public static void main(String[] args) {
		CarInstanceMemberAndThis myCar = new CarInstanceMemberAndThis("������");
		CarInstanceMemberAndThis yourCar = new CarInstanceMemberAndThis("����");
		
		myCar.run();
		yourCar.run();
	}
}
