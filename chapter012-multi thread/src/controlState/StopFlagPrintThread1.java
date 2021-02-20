package controlState;
/**
 * stop flag 활용 예제 (무한 반복 출력 스레드)
 * @author jikang
 *
 */
public class StopFlagPrintThread1 extends Thread{
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		// stop이 true 일때
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
	
	
}
