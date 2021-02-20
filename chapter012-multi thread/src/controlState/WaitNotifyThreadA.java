package controlState;
/**
 * wait() notify() notifyAll() �޼ҵ� Ȱ�� ���� ( WorkObject�� methodA()�� �����ϴ� ������ )
 * @author jikang
 *
 */
public class WaitNotifyThreadA extends Thread{
	private WaitNotifyWorkObject workObject;
	
	public WaitNotifyThreadA(WaitNotifyWorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
