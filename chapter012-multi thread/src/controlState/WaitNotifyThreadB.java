package controlState;
/**
 * wait() notify() notifyAll() �޼ҵ� Ȱ�� ����(WorkObject�� methodB()�� �����ϴ� ������)
 * @author jikang
 *
 */
public class WaitNotifyThreadB extends Thread{
	private WaitNotifyWorkObject workObject;

	public WaitNotifyThreadB(WaitNotifyWorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}

	
	
}
