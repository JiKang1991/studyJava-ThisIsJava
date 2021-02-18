package controlState;
/**
 * yield() �޼ҵ� Ȱ�� ���� ( ������ ���� �纸 ���� )
 * @author jikang
 *
 */
public class YieldExample {
	public static void main(String[] args) {
		YieldThreadA threadA = new YieldThreadA();
		YieldThreadB threadB = new YieldThreadB();
		
		// threadA, B ��� ����
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("------------3�� ��� ThreadA ���� ��� ���·�-------------");
		// ThreadA ���� ��� ���·�
		threadA.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("------------3�� ��� ThreadA, B ��� ����-------------");
		// ThreadA, B ��� ���� 
		threadA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("------------3�� ��� ThreadA, B ��� ����-------------");
		// threadA, B ��� ����
		threadA.stop = true;
		threadB.stop = true;
		
	}
}
