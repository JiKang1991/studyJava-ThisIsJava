package createThread;

import java.awt.Toolkit;

/**
 * ������ Ȱ�� ���� ( ������ �߻��� ����ϴ� �����带 �����ϱ����� �Ű������� Runnable �������̽��� �����ϴ� Ŭ���� ����)
 * @author jikang
 *
 */
public class ByThreadClassBeepTask implements Runnable{

	@Override
	public void run() {
		// ������ ���� ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
	
}
