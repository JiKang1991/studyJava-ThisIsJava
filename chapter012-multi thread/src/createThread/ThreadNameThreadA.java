package createThread;
/**
 * setName(), getName() Ȱ�� ����
 * @author jikang
 *
 */
public class ThreadNameThreadA extends Thread{
	
	
	public ThreadNameThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}	
}
