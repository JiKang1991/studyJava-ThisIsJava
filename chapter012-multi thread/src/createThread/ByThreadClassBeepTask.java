package createThread;

import java.awt.Toolkit;

/**
 * 스레드 활용 예제 ( 비프음 발생을 담당하는 스레드를 생성하기위한 매개변수인 Runnable 인터페이스를 구현하는 클래스 정의)
 * @author jikang
 *
 */
public class ByThreadClassBeepTask implements Runnable{

	@Override
	public void run() {
		// 스레드 실행 내용
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
