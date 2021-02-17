package studySynchronized;
/**
 * ���� ��ü ���� ������(���� �����尡 �����ϴ� �ڵ�)
 * @author jikang
 *
 */
public class MainThreadExample {
	public static void main(String[] args) {
		
		// ���� ��ü�� ����ȭ ���� ��
		//CautionCalculator calculator = new CautionCalculator();
		
		// ���� ��ü�� ����ȭ ����
		CautionCalculatorModifiedVer calculator = new CautionCalculatorModifiedVer();
		
		// CautionUser1 ������ ����
		CautionUser1 user1 = new CautionUser1();
		// ���� ��ü ����
		user1.setCalculator(calculator);
		// user1 ������ ����
		user1.start();
		
		// CautionUser2 ������ ����
		CautionUser2 user2 = new CautionUser2();
		// ���� ��ü ����
		user2.setCalculator(calculator);
		// user2 ������ ����
		user2.start();
				
	}
}
