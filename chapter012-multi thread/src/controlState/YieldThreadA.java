package controlState;
/**
 * yield() �޼ҵ� Ȱ�� ���� ( ������ ���� �纸 ���� )
 * @author jikang
 *
 */
public class YieldThreadA extends Thread {
	// ���� �÷���
	public boolean stop = false;
	// �۾� ���� ���� �÷���
	public boolean work = true;
		
	public void run() {
		// stop�� true�� �Ǹ� while �� ����
		while(!stop) {
			if (work) {				
				System.out.println("ThreadA �۾� ����");
			} else {
				// work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}
