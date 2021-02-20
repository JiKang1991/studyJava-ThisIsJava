package controlState;
/**
 * wait() notify() notifyAll() 메소드 활용 예제 ( 두 스레드를 생성하고 실행하는 메인 스레드 )
 * @author jikang
 *
 */
public class WaitNotifyExample1 {
	public static void main(String[] args) {
		WaitNotifyWorkObject sharedObject = new WaitNotifyWorkObject();
		
		WaitNotifyThreadA threadA = new WaitNotifyThreadA(sharedObject);
		WaitNotifyThreadB threadB = new WaitNotifyThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
