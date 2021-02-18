package threadState;
/**
 * ������ ���� ���� ( Ÿ�� �������� ���¸� ����ϴ� ������ )
 * @author jikang
 *
 */
public class CheckStatePrintThread extends Thread{
	private Thread targetThread;
	
	public CheckStatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			// Ÿ�� ������ ���� ���
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			
			// ��ü ���� ������ ��� ���� ��� ���·� ����
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			// ���� ������ ��� while���� ������
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			// 0.5�ʰ� �Ͻ� ����
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
