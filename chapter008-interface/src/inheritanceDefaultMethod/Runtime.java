package inheritanceDefaultMethod;
/**
 * ����Ʈ �޼ҵ� ��� ���� ( ���� Ŭ���� )
 * @author jikang
 *
 */
public class Runtime {
	public static void main(String[] args) {
		// ImplementationClass1 ȣ��
		ImplementationClass1 ic1 = new ImplementationClass1();
		ic1.method1();
		ic1.method2(); 		// �θ��������̽��� ����Ʈ�޼ҵ� ȣ��
		ic1.method3();
		
		// ImplementationClass2 ȣ��
		ImplementationClass2 ic2 = new ImplementationClass2();
		ic2.method1();
		ic2.method2(); 		// �ڽ��������̽�2���� �������� �޼ҵ� ȣ��
		ic2.method3();
				
		// ImplementationClass3 ȣ��
		ImplementationClass3 ic3 = new ImplementationClass3();
		ic3.method1();
		ic3.method2(); 		// �ڽ��������̽�3���� �߻�޼ҵ�� �������� �޼ҵ� ȣ��
		ic3.method3();
	}
}
