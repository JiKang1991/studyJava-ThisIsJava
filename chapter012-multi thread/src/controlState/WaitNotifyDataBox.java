package controlState;
/**
 * wait() notify() 메소드 활용 예제 ( 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 예제 )
 * @author jikang
 *
 */
public class WaitNotifyDataBox {
	private String data;
	
	public synchronized String getData() {
		// data 필드가 null이면 소비자 스레드를 일시 정지 상태로 만듬
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
		
		// data 필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듬
		data = null;
		notify();
		
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		// data 필드가 null이 아니면 생산자 스레드를 일시 정지 상태로 만듬
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		// data 필드에 값을 저장하고 소비자 스레드를 실행 대기 상태로 만듬
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}
}
