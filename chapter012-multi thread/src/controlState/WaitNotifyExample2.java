package controlState;
/**
 * wait() notify() �޼ҵ� Ȱ�� ���� ( �� �����带 �����ϰ� �����ϴ� ���� ������ )
 * @author jikang
 *
 */
public class WaitNotifyExample2 {
	public static void main(String[] args) {
		WaitNotifyDataBox dataBox = new WaitNotifyDataBox();
		
		WaitNotifyProducerThread producerThread = new WaitNotifyProducerThread(dataBox);
		WaitNotifyConsumerThread consumerThread = new WaitNotifyConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
