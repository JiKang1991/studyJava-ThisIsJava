package controlState;
/**
 * join() 메소드 활용 예제 ( 다른 스레드가 종료될 때 까지 일시 정지 상태 유지)
 * @author jikang
 *
 */
public class JoinExample {
	public static void main(String[] args) {
		JoinSumThread sumThread = new JoinSumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100 합 : " + sumThread.getSum());
	}
}
