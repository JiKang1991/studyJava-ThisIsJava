package controlState;
/**
 * wait(), notify(), notifyAll() �޼ҵ� Ȱ�� ���� ( �� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü )
 * @author jikang
 *
 */
public class WaitNotifyWorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		// �ǽ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ����
		notify();
		try {
			// ThreadA�� �Ͻ� ���� ���·� ����
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		// �Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ����
		notify();
		try {
			// ThreadB�� �Ͻ� ���� ���·� ����
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
