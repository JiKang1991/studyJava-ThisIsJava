package controlState;
/**
 * yield() �޼ҵ� Ȱ�� ���� ( ������ ���� �纸 ���� )
 * @author jikang
 *
 */
public class YieldThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
		
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB �۾� ����");
	}
}
