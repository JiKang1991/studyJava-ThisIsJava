package referenceType;
/**
 * �迭�� length �ʵ带 ����ϴ� ����
 * @author jikang
 *
 */
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30 };
		int num = intArray.length;	// num���� 3�� ����ȴ�.
		
		int[] scores = { 83, 90, 87 };
		int sum  = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);		// sum���� 260�� ����Ǿ��ִ�.
		
		double avg = (double) sum / scores.length;	// 260�� 3���� ������
		System.out.println("��� : " + avg);	
	}
}
