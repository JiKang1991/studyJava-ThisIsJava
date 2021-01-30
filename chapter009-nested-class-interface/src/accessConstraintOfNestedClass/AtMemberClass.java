package accessConstraintOfNestedClass;
/**
 * ��ø Ŭ�������� �ٱ� �ʵ�� �޼ҵ� ��� ���� ����
 * @author jikang
 *
 */
public class AtMemberClass {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// �ν��Ͻ� ��� Ŭ���� �ȿ����� ��� �ٱ� �ʵ�� �޼ҵ忡 ������ �� �ִ�. 
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// ���� ��� Ŭ���� �ȿ����� �ٱ��� �ν��Ͻ� �ʵ�� �޼ҵ忡 ������ �� ����.
	static class C {
		void method() {
			// field1 = 10;
			// method
			
			field2 = 10;
			method2();
		}
	}
}
