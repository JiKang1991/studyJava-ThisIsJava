package accessConstraintOfNestedClass;
/**
 * �ٱ� �ʵ�� �޼ҵ忡�� ��ø Ŭ������ ��� ���� ����
 * @author jikang
 *
 */
public class AtOutterClassMethod {
	// instance member class
	class B {}
			
	// static member class
	static class C {}
	
	// instance field
	B field1 = new B();
	C field2 = new C();
	
	// instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
			
	// initialization of static field
	// static B field3 = new B();	// �ν��Ͻ� ��� Ŭ������ ��ü�� ���� �� ����.
	static C field4 = new C();
	
	// static method
	static void method2() {
		//B var1 = new B();	// �ν��Ͻ� ��� Ŭ������ ��ü�� ���� �� ����.
		C var2 = new C();
	}
}
