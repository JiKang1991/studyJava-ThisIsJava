package controlState;
/**
 * wait() notify() 메서드 활용 예제 ( 데이터를 생산(저장) 하는 스레드 )
 * @author jikang
 *
 */
public class WaitNotifyProducerThread extends Thread{
	private WaitNotifyDataBox dataBox;

	public WaitNotifyProducerThread(WaitNotifyDataBox dataBox) {
		// 공유 객체를 필드에 저장
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			// 새로운 데이터를 저장
			dataBox.setData(data);
		}
	}
	
	
	
}
