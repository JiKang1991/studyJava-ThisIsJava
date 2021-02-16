package createThread;

import java.awt.Toolkit;

/**
 * 스레드 활용 예제(메인스레드와 작업스레드를 이용하여 비프음 발생과 비프음 프린팅 작업 동시에 실행하기)
 * @author jikang
 *
 */
public class ByThreadClassBeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new ByThreadClassBeepTask();
		/*
		// Runnable 인터페이스 구현 객체를 이용한 스레드 생성 방법
		Thread thread = new Thread(beepTask);
		*/
		/*
		// Runnable 익명 객체를 이용한 스레드 생성 방법
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch(Exception e) {
						
					}
				}
			}
		});
		*/
		
		// 람다식을 이용한 스레드 생성 방법
		Thread thread = new Thread( ()-> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch(Exception e) {
					
				}
			}
		});
		
	
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
