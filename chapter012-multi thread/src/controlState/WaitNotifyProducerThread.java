package controlState;
/**
 * wait() notify() �޼��� Ȱ�� ���� ( �����͸� ����(����) �ϴ� ������ )
 * @author jikang
 *
 */
public class WaitNotifyProducerThread extends Thread{
	private WaitNotifyDataBox dataBox;

	public WaitNotifyProducerThread(WaitNotifyDataBox dataBox) {
		// ���� ��ü�� �ʵ忡 ����
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			// ���ο� �����͸� ����
			dataBox.setData(data);
		}
	}
	
	
	
}
