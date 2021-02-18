package threadState;
/**
 * 스레드 상태 예제( 타겟 스레드 )
 * @author jikang
 *
 */
public class CheckTargetThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 1000000000; i++) {

		}
		
		// 1.5초간 일시 정지
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(long i = 0; i < 1000000000; i++) {
			
		}
	}
}
