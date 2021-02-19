package controlState;
/**
 * join() �޼ҵ� Ȱ�� ���� ( �ٸ� �����尡 ����� �� ���� �Ͻ� ���� ���� ����)
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
		
		System.out.println("1 ~ 100 �� : " + sumThread.getSum());
	}
}
