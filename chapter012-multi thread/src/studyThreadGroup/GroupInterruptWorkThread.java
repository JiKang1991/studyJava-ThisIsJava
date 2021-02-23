package studyThreadGroup;
/**
 * Thread Group Interrupt ���� ( InterruptedException�� �߻��� �� �����尡 ����ǵ��� �� )
 * @author jikang
 *
 */
public class GroupInterruptWorkThread extends Thread{
	public GroupInterruptWorkThread(ThreadGroup threadGroup, String threadName) {
		// ������ �׷�� ������ �̸��� ����
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch ( InterruptedException e ) {
				// InterruptedException�� �߻��� ��, while���� �������� �����带 �����Ŵ
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " �����");
	}	
}
