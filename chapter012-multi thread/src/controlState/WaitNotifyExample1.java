package controlState;
/**
 * wait() notify() notifyAll() �޼ҵ� Ȱ�� ���� ( �� �����带 �����ϰ� �����ϴ� ���� ������ )
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
