package accessConstraintOfNestedClass;
/**
 * 바깥 필드와 메소드에서 중첩 클래스의 사용 제한 예제
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
	// static B field3 = new B();	// 인스턴스 멤버 클래스의 객체를 만들 수 없다.
	static C field4 = new C();
	
	// static method
	static void method2() {
		//B var1 = new B();	// 인스턴스 멤버 클래스의 객체를 만들 수 없다.
		C var2 = new C();
	}
}
