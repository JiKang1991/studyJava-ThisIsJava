package controlState;
/**
 * stop flag Ȱ�� ���� ( ���� ������ )
 * @author jikang
 *
 */
public class StopFlagExample {
	public static void main(String[] args) {
		StopFlagPrintThread1 printThread = new StopFlagPrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		// �����带 �����Ű�� ���� stop �ʵ带 true�� ����
		printThread.setStop(true);
	}
}
