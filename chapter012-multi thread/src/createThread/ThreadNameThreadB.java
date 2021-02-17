package createThread;
/**
 * setName(), getName() 활용 예제
 * @author jikang
 *
 */
public class ThreadNameThreadB extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}	
}