package createThread;

import java.awt.Toolkit;

/**
 * ������ Ȱ�� ����(���� �����常 �̿��Ͽ� ������ �߻��� ������ ������ �۾� �����ϱ�)
 * @author jikang
 *
 */
public class ByThreadClassBeepPrintExample1 {
	public static void main(String[] args) {
		// �������� �߻���Ű�� ���� ��Ŷ ��ü ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// ������ �߻� ��Ű��
		for(int i = 0; i < 5; i++) {
			// ������ �߻�
			toolkit.beep();
			try {
				// 0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);
			} catch(Exception e) {
				
			}			
		}
		// ������ �������ϱ�
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		} 
	}
}
