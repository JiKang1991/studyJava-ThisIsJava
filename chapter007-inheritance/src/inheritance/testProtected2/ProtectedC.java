package inheritance.testProtected2;

import inheritance.testProtected1.ProtectedA;

/**
 * �ٸ� ��Ű������ �ٸ� Ŭ������ protected ����Ǿ��ִ� ����� �����ϴ� ����
 * @author jikang
 *
 */
public class ProtectedC {
	public void method() {
		ProtectedA a = new ProtectedA();		// ���� �Ұ�
		a.field = "value";						// ���� �Ұ�
		a.method();								// ���� �Ұ�
	}
}
