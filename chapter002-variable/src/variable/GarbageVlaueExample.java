package variable;
/**
 * byte ������ int ������ ���� 125�� �ʱ�ȭ�ϰ� 5ȸ�� ���� 1�� ���ϱ��� ���� ����� ����� Ȯ���ϴ� ����
 * byte ������ 127�� �Ѿ�� ���� �ּҰ��� -128���� �ٽ� ����ǰ�,
 * int Ÿ���� ������ ���������� 1�� ������ ���� ��� �����Ѵ�.
 * @author jikang
 *
 */
public class GarbageVlaueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
