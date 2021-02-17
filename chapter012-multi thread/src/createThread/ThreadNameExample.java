package createThread;
/**
 * setName(), getName(), currentThread() �޼ҵ� Ȱ�� ����
 * @author jikang
 *
 */
public class ThreadNameExample {
	public static void main(String[] args) {
		// ���� �������� ��ü ���
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� :" + mainThread.getName());
		
		// ThreadNameThreadA ����
		ThreadNameThreadA threadA = new ThreadNameThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		// ThreadNameThreadB ����
		ThreadNameThreadB threadB = new ThreadNameThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();
	}
}
