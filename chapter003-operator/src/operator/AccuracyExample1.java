package operator;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("��� �Ѱ����� ");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result + "������ ���´�."); // 0.3 (x)	0.29999999999999993(o)
		// �ε� �Ҽ��� Ÿ���� 0.1�� ��Ȯ�� ǥ���� �� ���� �ٻ�ġ�� ó���ϱ� �����̴�.
	}
}