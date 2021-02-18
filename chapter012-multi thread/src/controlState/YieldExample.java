package controlState;
/**
 * yield() 메소드 활용 예제 ( 스레드 실행 양보 예제 )
 * @author jikang
 *
 */
public class YieldExample {
	public static void main(String[] args) {
		YieldThreadA threadA = new YieldThreadA();
		YieldThreadB threadB = new YieldThreadB();
		
		// threadA, B 모두 실행
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("------------3초 경과 ThreadA 실행 대기 상태로-------------");
		// ThreadA 실행 대기 상태로
		threadA.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("------------3초 경과 ThreadA, B 모두 실행-------------");
		// ThreadA, B 모두 실행 
		threadA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("------------3초 경과 ThreadA, B 모두 종료-------------");
		// threadA, B 모두 종료
		threadA.stop = true;
		threadB.stop = true;
		
	}
}
