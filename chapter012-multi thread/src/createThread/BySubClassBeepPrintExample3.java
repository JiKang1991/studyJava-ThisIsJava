package createThread;

import java.awt.Toolkit;

/**
 * Thread ���� ���� (Thread�� extends �ϴ� SubClass ��ü�� �����Ͽ� ȣ���ϴ� main thread class)
 * @author jikang
 *
 */
public class BySubClassBeepPrintExample3 {
	public static void main(String[] args) {
		/*
		// Thread Ŭ������ extends�� sub class�� ����Ͽ� thread ��ü�� �����ϴ� ���
		Thread thread = new BySubClassBeepThread();
		*/
		
		// �͸� ��ü�� Ȱ���ϴ� ��� (Runnable �������̽��� �����ϴ� ���� �ƴ� Thread Ŭ������ �������̵��ϴ� ���)
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
			
		};
		
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
