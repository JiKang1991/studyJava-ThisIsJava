package defaultMethod;
/**
 * ����Ʈ �޼ҵ� Ȱ�� ����(���� Ŭ����B)
 * @author jikang
 *
 */
public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
	}
	
	// ����Ʈ �޼ҵ� ������
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() ����");
	}
	
}
