package createThread;
/**
 * setName(), getName(), currentThread() 메소드 활용 예제
 * @author jikang
 *
 */
public class ThreadNameExample {
	public static void main(String[] args) {
		// 현재 스레드의 객체 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 :" + mainThread.getName());
		
		// ThreadNameThreadA 생성
		ThreadNameThreadA threadA = new ThreadNameThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		// ThreadNameThreadB 생성
		ThreadNameThreadB threadB = new ThreadNameThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}
}
