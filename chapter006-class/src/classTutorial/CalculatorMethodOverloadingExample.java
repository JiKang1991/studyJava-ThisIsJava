package classTutorial;
/**
 * �޼ҵ� �����ε� ���� ����
 * @author jikang
 *
 */
public class CalculatorMethodOverloadingExample {
	public static void main(String[] args) {
		CalculatorMethodOverloading myCalcu = new CalculatorMethodOverloading();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// ��� ���
		System.out.println("���簢���� ���� : " + result1);
		System.out.println("���簢���� ���� : " + result2);
	}
}
