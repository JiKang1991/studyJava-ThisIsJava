package threadState;
/**
 * 스레드 상태 예제 ( 타겟 스레드의 상태를 출력하는 스레드 )
 * @author jikang
 *
 */
public class CheckStatePrintThread extends Thread{
	private Thread targetThread;
	
	public CheckStatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			// 타겟 스레드 상태 얻기
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : " + state);
			
			// 객체 생성 상태일 경우 실행 대기 상태로 만듬
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			// 종료 상태일 경우 while문을 종료함
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			// 0.5초간 일시 정지
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
