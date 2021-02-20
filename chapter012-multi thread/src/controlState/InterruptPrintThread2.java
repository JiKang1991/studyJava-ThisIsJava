package controlState;
/**
 * interrupt(), interrupted() 메소드 활용 예제 ( 무한 반복 출력 스레드 )
 * @author jikang
 *
 */
public class InterruptPrintThread2 extends Thread {
	public void run() {
		/*
		// Thread.sleep() 메소드를 사용해 InterruptedException을 발생시킴
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		*/
		
		// interrupted() 메소드를 사용해 while문을 빠져 나감
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
