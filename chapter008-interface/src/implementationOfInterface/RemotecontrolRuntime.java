package implementationOfInterface;

import declarationOfInterface.RemoteControl;

/**
 * �������̽��� �̿��Ͽ� ����Ŭ������ ����� �����ϴ� ����
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
