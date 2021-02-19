package controlState;
/**
 * join() 메소드 활용 예제 ( 1 ~ 100의 합을 계산하는 메소드 )
 * @author jikang
 *
 */
public class JoinSumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
