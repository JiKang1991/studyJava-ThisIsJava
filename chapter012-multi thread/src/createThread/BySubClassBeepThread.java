package createThread;

import java.awt.Toolkit;

/**
 * Thread ���� ����( Thread Class�� extends�ϴ� SubClass�� �����Ͽ� �������� �߻���Ų��)
 * @author jikang
 *
 */
public class BySubClassBeepThread extends Thread{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
	
}
