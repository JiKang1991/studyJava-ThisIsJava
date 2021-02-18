package controlState;
/**
 * yield() 메소드 활용 예제 ( 스레드 실행 양보 예제 )
 * @author jikang
 *
 */
public class YieldThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
		
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 작업 종료");
	}
}
