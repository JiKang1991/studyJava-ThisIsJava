package inheritance;
/**
 * ��ӹ��� �޼ҵ带 �ڽ� Ŭ�������� �������̵� �ϴ� ���� (�ڽ�Ŭ����)
 * @author jikang
 *
 */
public class OverrideMethodComputer extends OverrideMethodCalculator{
	// �޼ҵ尡 ��Ȯ�� �������̵� �� ������ üũ�Ѵ�.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		// �θ� Ŭ������ ����Ǿ��ִ� '3.14159' ���� ������ ����� ����
		// 'Math.PI' ����� �̿��Ѵ�.
		return Math.PI * r * r;
	}
	
}
