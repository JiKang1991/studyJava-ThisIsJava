package studySynchronized;
/**
 * ���� ��ü ���� ������ ( �۾� ������ )
 * @author jikang
 *
 */
public class CautionUser2 extends Thread{
	/*
	// ���� ��ü�� ����ȭ ���� ��
	private CautionCalculator calculator;
	
	public void setCalculator(CautionCalculator calculator) {
		// ������ �̸��� user2�� ����
		this.setName("user2");
		// ���� ��ü�� Calculator�� �ʵ忡 ����
		this.calculator = calculator;
	}
	*/
	
	// ���� ��ü�� ����ȭ ����
	private CautionCalculatorModifiedVer calculator;
	
	public void setCalculator(CautionCalculatorModifiedVer calculator) {
		// ������ �̸��� user2�� ����
		this.setName("user2");
		// ���� ��ü�� Calculator�� �ʵ忡 ����
		this.calculator = calculator;
	}
	
	public void run() {
		// ���� ��ü�� Calculator�� �޸𸮿� 50�� ����
		calculator.setMemory(50);
	}
}
