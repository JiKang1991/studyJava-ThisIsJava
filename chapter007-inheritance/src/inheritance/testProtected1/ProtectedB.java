package inheritance.testProtected1;
/** 
 * ���� ��Ű������ �ٸ� Ŭ������ protected ����Ǿ��ִ� ����� �����ϴ� ���� 
 * @author jikang
 *
 */
public class ProtectedB {
	public void method() {
		ProtectedA a = new ProtectedA();		// ���� ����
		a.field = "value";						// ���� ����
		a.method();								// ���� ����
	}
}
