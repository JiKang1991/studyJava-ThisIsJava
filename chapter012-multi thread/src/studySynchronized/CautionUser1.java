package studySynchronized;
/**
 * ���� ��ü ���� ������ ( �۾� ������ )
 * @author jikang
 *
 */
public class CautionUser1 extends Thread{
	/*
	// ���� ��ü�� ����ȭ �����ϱ� ��
	private CautionCalculator calculator;
	
	public void setCalculator(CautionCalculator calculator) {
		// ������ �̸��� user1�� ����
		this.setName("user1");
		// ���� ��ü�� Calculator�� �ʵ忡 ����
		this.calculator = calculator;
	}
	*/
	
	// ���� ��ü�� ����ȭ ����
	private CautionCalculatorModifiedVer calculator;
	
	public void setCalculator(CautionCalculatorModifiedVer calculator) {
		// ������ �̸��� user1�� ����
		this.setName("user1");
		// ���� ��ü�� Calculator�� �ʵ忡 ����
		this.calculator = calculator;
	}
	
	public void run() {
		// ���� ��ü�� Calculator�� �޸𸮿� 100�� ����
		calculator.setMemory(100);
	}
}
