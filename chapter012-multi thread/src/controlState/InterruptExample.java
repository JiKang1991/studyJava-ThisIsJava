package controlState;
/**
 * interrupt() �޼ҵ� Ȱ�� ���� ( main ������ )
 * @author jikang
 *
 */
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new InterruptPrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// �����带 �����Ű�� ���� InterruptedException�� �߻� ��Ŵ
		thread.interrupt();
	}
}
