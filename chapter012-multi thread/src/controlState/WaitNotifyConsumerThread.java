package controlState;
/**
 * wait() notify() 메소드 활용 예제 ( 데이터를 소비하는(읽는) 스레드 )
 * @author jikang
 *
 */
public class WaitNotifyConsumerThread extends Thread{
	private WaitNotifyDataBox dataBox;

	public WaitNotifyConsumerThread(WaitNotifyDataBox dataBox) {
		// 공유 객체를 필드에 저장
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i < 3; i++) {
			// 새로운 데이터를 읽음
			dataBox.getData();
		}
	}
	
	
}
