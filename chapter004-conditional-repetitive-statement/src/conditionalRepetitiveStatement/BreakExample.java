package conditionalRepetitiveStatement;
/**
 * �ֻ��� ��ȣ �� �ϳ��� �ݺ������� �̵�, 6�� ������ while���� break�� �����Ű�� ����
 * @author jikang
 *
 */
public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			// Math.random()�� �̿��Ͽ� 1~6�� ��ȣ�� �������� num������ �����Ѵ�.
			int num	= (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
	
}
