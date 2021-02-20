package controlState;
/**
 * wait(), notify(), notifyAll() 메소드 활용 예제 ( 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체 )
 * @author jikang
 *
 */
public class WaitNotifyWorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		// 실시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬
		notify();
		try {
			// ThreadA를 일시 정지 상태로 만듬
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		// 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듬
		notify();
		try {
			// ThreadB를 일시 정지 상태로 만듬
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
