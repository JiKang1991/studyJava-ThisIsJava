package inheritanceDefaultMethod;
/**
 * ����Ʈ �޼ҵ� ��� ����(�ڽ� �������̽�2)
 * @author jikang
 *
 */
public interface ChildInterface2 extends ParentInterface{
	
	// ����Ʈ �޼ҵ� ������
	@Override
	default void method2() {
		/* ���๮ */
	}
	
	public void method3();
	
}
