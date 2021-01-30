package accessConstraintOfNestedClass;
/**
 * ��ø Ŭ�������� �ٱ� Ŭ���� ���� ��� ����
 * @author jikang
 *
 */
public class GetReferenceOfOutters {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(GetReferenceOfOutters.this.field);
			GetReferenceOfOutters.this.method();
			
		}
	}
}
