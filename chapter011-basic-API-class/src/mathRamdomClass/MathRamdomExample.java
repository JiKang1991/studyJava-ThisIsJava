package mathRamdomClass;
/**
 * Math.random() �޼ҵ� Ȱ�� ����( ������ �ֻ����� �� ��� )
 * @author jikang
 *
 */
public class MathRamdomExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		System.out.println("�ֻ����� �� : " + num);
	}
}
