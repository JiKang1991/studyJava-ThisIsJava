package conditionalRepetitiveStatement;
/**
 * continue�� ����Ͽ� 1~10 �߿��� ¦���� ����ϴ� ����
 * @author jikang
 *
 */
public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			// 2�� ���� �������� 0�� �ƴ� ���, �� Ȧ���� ���
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);	// Ȧ���� ������� �ʴ´�.
		}
	}
}
