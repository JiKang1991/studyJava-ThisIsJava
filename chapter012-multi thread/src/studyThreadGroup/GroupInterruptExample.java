package studyThreadGroup;
/**
 * Thread Group Interrupt 예제 ( 스레드 그룹을 이용한 일괄 종료 예제 )
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
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();
	}
}
