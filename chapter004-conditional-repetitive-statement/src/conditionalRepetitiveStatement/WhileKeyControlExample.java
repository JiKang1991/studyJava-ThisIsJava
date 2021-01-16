package conditionalRepetitiveStatement;

import java.io.IOException;

/**
 * Ű���忡�� 1, 2�� �Է����� �� �ӵ��� ����, ���� ��Ű��
 * 3�� �Է��ϸ� ���α׷��� �����Ű�� ����
 * 
 * (1) while���� ���ǽĿ� ����� boolean ������ �ʱⰪ true�� �ο��Ͽ� �����Ѵ�.
 * (2) ���� ������ ���������� ���� Ű���� 3���� �Է��ϸ� while���� ���ǽ� ������ false���� �ο��� �޼ҵ带 �����Ѵ�.
 * 
 * @author jikang
 *
 */
public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// Enter Ű�� �ԷµǸ� ĳ��������(13)�� �����ǵ�(10)�� �ԷµǹǷ� �� ���� ���ܽ�Ų��.
			if(keyCode != 13 && keyCode != 10) {
				// �޴� ����
				System.out.println("-------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("-------------------------");
				System.out.print("���� : ");
			}
			
			// Ű������ Ű �ڵ带 �д´�.
			// �Է¹��� ��ȣ�� Enter�� ��ȣ 13, 10�� ���ʷ� �����Ѵ�.
			// ��, �Է��� ��ȣ�� �ִٸ� Enter�� ���������� while���� 3�� �ݺ��ȴ�.
			keyCode = System.in.read();
						
			if(keyCode == 49) {	// Ű������ 1�� �ԷµǾ��� ���
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			} else if(keyCode == 50) { // Ű������ 2�� �ԷµǾ��� ���
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			} else if(keyCode == 51) { // Ű������ 3�� �ԷµǾ��� ���
				run = false;	// while���� �����ϱ� ���� run ������ false�� ����
			}
		}
		System.out.println("���α׷� ����");
	}
}
