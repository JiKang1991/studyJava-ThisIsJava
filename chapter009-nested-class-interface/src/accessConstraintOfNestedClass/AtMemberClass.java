package accessConstraintOfNestedClass;
/**
 * 중첩 클래스에서 바깥 필드와 메소드 사용 제한 예제
 * @author jikang
 *
 */
public class AtMemberClass {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스 안에서는 모든 바깥 필드와 메소드에 접근할 수 있다. 
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스 안에서는 바깥의 인스턴스 필드와 메소드에 접근할 수 없다.
	static class C {
		void method() {
			// field1 = 10;
			// method
			
			field2 = 10;
			method2();
		}
	}
}
