package inheritanceOfInterface;
/**
 * �������̽� ��� ���� (���� �������̽� ���� Ŭ����)
 * @author jikang
 *
 */
public class ImplementationC implements InterfaceC {
	// InterfaceA, B�� ��ü �޼ҵ嵵 �־�� �Ѵ�.
	@Override
	public void methodA() {
		System.out.println("ImplementationC - methodA() ����");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC - methodB() ����");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC - methodC() ����");
	}
	
}
