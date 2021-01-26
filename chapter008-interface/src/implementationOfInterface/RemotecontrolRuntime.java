package implementationOfInterface;

import declarationOfInterface.RemoteControl;

/**
 * 인터페이스를 이용하여 구현클래스를 만들고 실행하는 예제
 * @author jikang
 *
 */
public class RemotecontrolRuntime {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}
}
