package controlState;
/**
 * interrupt(), interrupted() �޼ҵ� Ȱ�� ���� ( ���� �ݺ� ��� ������ )
 * @author jikang
 *
 */
public class InterruptPrintThread2 extends Thread {
	public void run() {
		/*
		// Thread.sleep() �޼ҵ带 ����� InterruptedException�� �߻���Ŵ
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		*/
		
		// interrupted() �޼ҵ带 ����� while���� ���� ����
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
