package createThread;

import java.awt.Toolkit;

/**
 * Thread 생성 예제( Thread Class를 extends하는 SubClass를 정의하여 비프음을 발생시킨다)
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
