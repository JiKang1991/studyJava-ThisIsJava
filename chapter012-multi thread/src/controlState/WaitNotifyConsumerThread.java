package controlState;
/**
 * wait() notify() �޼ҵ� Ȱ�� ���� ( �����͸� �Һ��ϴ�(�д�) ������ )
 * @author jikang
 *
 */
public class WaitNotifyConsumerThread extends Thread{
	private WaitNotifyDataBox dataBox;

	public WaitNotifyConsumerThread(WaitNotifyDataBox dataBox) {
		// ���� ��ü�� �ʵ忡 ����
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i < 3; i++) {
			// ���ο� �����͸� ����
			dataBox.getData();
		}
	}
	
	
}
