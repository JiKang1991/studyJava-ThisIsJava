package classTutorial;
/**
 * Ŭ���� ���ο��� �޼ҵ带 ȣ���ϴ� ����
 * @author jikang
 *
 */
public class CalculatorCallMethodInClass {
	// method
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	// plus() ȣ��
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);		// avg() ȣ��
		println("������ : " + result);	// println() ȣ��
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
