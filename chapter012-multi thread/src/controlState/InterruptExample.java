package controlState;
/**
 * interrupt() 메소드 활용 예제 ( main 스레드 )
 * @author jikang
 *
 */
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new InterruptPrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 스레드를 종료시키기 위해 InterruptedException을 발생 시킴
		thread.interrupt();
	}
}
