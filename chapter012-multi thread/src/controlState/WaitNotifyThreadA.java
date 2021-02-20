package controlState;
/**
 * wait() notify() notifyAll() 메소드 활용 예제 ( WorkObject의 methodA()를 실행하는 스레드 )
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
