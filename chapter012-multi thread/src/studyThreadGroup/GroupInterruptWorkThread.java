package studyThreadGroup;
/**
 * Thread Group Interrupt 예제 ( InterruptedException이 발생할 때 스레드가 종료되도록 함 )
 * @author jikang
 *
 */
public class GroupInterruptWorkThread extends Thread{
	public GroupInterruptWorkThread(ThreadGroup threadGroup, String threadName) {
		// 스레드 그룹과 스레드 이름을 설정
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch ( InterruptedException e ) {
				// InterruptedException이 발생될 때, while문을 빠져나와 스레드를 종료시킴
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}	
}
