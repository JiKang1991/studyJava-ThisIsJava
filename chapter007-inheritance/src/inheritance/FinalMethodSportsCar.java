package inheritance;
/**
 * final method�� ������ �� �� ������ Ȯ���ϴ� ����
 * @author jikang
 *
 */
public class FinalMethodSportsCar extends FinalMethodCar{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {	// �����Ͽ��� �߻�
		System.out.println("������ī�� ����");
		speed = 0;
	}
	

}
