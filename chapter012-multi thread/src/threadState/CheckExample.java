package threadState;
/**
 * 스레드 상태 예제( 실행 클래스 )
 * @author jikang
 *
 */
public class CheckExample {
	public static void main(String[] args) {
		CheckStatePrintThread statePrintThread =
				new CheckStatePrintThread(new CheckTargetThread());
		statePrintThread.start();
	}
}
