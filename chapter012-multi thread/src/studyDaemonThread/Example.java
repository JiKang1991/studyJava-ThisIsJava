package studyDaemonThread;
/**
 * 데몬 스레드 예제 ( 메인스레드가 실행하는 코드 )
 * @author jikang
 *
 */
public class Example {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("메인 스레드 종료");
	}
}
