package inheritance;
/**
 * ��ӹ��� �޼ҵ带 �ڽ� Ŭ�������� �������̵� �ϴ� ���� (�ڽ� ��ü ����)
 * @author jikang
 *
 */
public class OverrideMethodComputerRuntime {
	public static void main(String[] args) {
		int r = 10;
		
		OverrideMethodCalculator calculator = new OverrideMethodCalculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		OverrideMethodComputer computer = new OverrideMethodComputer();
		System.out.println("������ : " + computer.areaCircle(r));		// �����ǵ� �޼ҵ� ȣ��
	}
}
