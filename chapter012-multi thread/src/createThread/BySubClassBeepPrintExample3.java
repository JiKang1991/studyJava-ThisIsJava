package createThread;

import java.awt.Toolkit;

/**
 * Thread 생성 예제 (Thread를 extends 하는 SubClass 객체를 생성하여 호출하는 main thread class)
 * @author jikang
 *
 */
public class BySubClassBeepPrintExample3 {
	public static void main(String[] args) {
		/*
		// Thread 클래스를 extends한 sub class를 사용하여 thread 객체를 생성하는 방법
		Thread thread = new BySubClassBeepThread();
		*/
		
		// 익명 객체를 활용하는 방법 (Runnable 인터페이스를 구현하는 것이 아닌 Thread 클래스를 오버라이딩하는 방법)
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
			
		};
		
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
