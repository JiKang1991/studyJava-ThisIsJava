package controlState;

import java.awt.Toolkit;

/**
 * sleep() 메소드 활용 예제
 * @author jikang
 *
 */
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
