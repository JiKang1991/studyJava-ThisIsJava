package inheritance.testProtected2;

import inheritance.testProtected1.ProtectedA;

/**
 * �ٸ� ��Ű������ ��� ������ �θ� Ŭ������ protected ����Ǿ��ִ� ����� �����ϴ� ����
 * @author jikang
 *
 */
public class ProtectedD extends ProtectedA{
	public ProtectedD() {
		super();				// ������ ���� ����
		this.field = "value";	// �ʵ� ���� ����
		this.method(); 			// �޼ҵ� ���� ����
	}
}
