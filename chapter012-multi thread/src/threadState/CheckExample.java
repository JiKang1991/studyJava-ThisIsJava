package threadState;
/**
 * ������ ���� ����( ���� Ŭ���� )
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
