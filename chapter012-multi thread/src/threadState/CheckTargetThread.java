package threadState;
/**
 * ������ ���� ����( Ÿ�� ������ )
 * @author jikang
 *
 */
public class CheckTargetThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 1000000000; i++) {

		}
		
		// 1.5�ʰ� �Ͻ� ����
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(long i = 0; i < 1000000000; i++) {
			
		}
	}
}
