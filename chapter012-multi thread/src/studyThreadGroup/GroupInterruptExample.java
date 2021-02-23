package studyThreadGroup;
/**
 * Thread Group Interrupt ���� ( ������ �׷��� �̿��� �ϰ� ���� ���� )
 * @author jikang
 *
 */
public class GroupInterruptExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		GroupInterruptWorkThread workThreadA
			= new GroupInterruptWorkThread(myGroup, "workThreadA");
		GroupInterruptWorkThread workThreadB
			= new GroupInterruptWorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt();
	}
}
