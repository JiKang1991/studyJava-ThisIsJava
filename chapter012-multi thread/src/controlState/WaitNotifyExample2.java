package controlState;
/**
 * wait() notify() 메소드 활용 예제 ( 두 스레드를 생성하고 실행하는 메인 스레드 )
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
