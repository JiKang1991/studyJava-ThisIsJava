package createThread;
/**
 * setName(), getName() Ȱ�� ����
 * @author jikang
 *
 */
public class ThreadNameThreadB extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}	
}