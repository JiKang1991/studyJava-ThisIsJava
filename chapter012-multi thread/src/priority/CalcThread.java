package priority;
/**
 * thread priority 활용 예제 (작업 스레드, 20억번의 루핑을 수행)
 * @author jikang
 *
 */
public class CalcThread extends Thread{

	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for(int i = 0; i < 2000000000; i++) {
			
		}
		System.out.println(getName());
	}
	
}
