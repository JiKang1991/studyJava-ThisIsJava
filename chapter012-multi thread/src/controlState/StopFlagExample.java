package controlState;
/**
 * stop flag 활용 예제 ( 메인 스레드 )
 * @author jikang
 *
 */
public class StopFlagExample {
	public static void main(String[] args) {
		StopFlagPrintThread1 printThread = new StopFlagPrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		// 스레드를 종료시키기 위해 stop 필드를 true로 변경
		printThread.setStop(true);
	}
}
