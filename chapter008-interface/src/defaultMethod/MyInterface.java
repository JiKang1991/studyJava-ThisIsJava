package defaultMethod;
/**
 * ����Ʈ �޼ҵ� Ȱ�� ����(�������̽�)
 * @author jikang
 *
 */
public interface MyInterface {
	// before modify
	public void method1();
	
	// after modify 
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
