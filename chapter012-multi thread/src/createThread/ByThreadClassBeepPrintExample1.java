package createThread;

import java.awt.Toolkit;

/**
 * 스레드 활용 예제(메인 스레드만 이용하여 비프음 발생과 비프음 프린팅 작업 실행하기)
 * @author jikang
 *
 */
public class ByThreadClassBeepPrintExample1 {
	public static void main(String[] args) {
		// 비프음을 발생시키기 위한 툴킷 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 비프음 발생 시키기
		for(int i = 0; i < 5; i++) {
			// 비프음 발생
			toolkit.beep();
			try {
				// 0.5초간 일시 정지
				Thread.sleep(500);
			} catch(Exception e) {
				
			}			
		}
		// 비프음 프린팅하기
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		} 
	}
}
