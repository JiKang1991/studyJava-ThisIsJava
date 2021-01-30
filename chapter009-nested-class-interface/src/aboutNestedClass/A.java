package aboutNestedClass;
/**
 * 중첩 클래스 선언 및 호출 예제(중첩클래스 선언)
 * @author jikang
 *
 */
/** 바깥 클래스 **/
public class A {
	/** 바깥 클래스 생성자 **/
	A() { System.out.println("A 객체가 생성됨."); }
	
	/** 인스턴스 멤버 클래스 **/
	class B {
		B() { System.out.println("B 객체가 생성됨."); }
		int field1;
		// static int field2;			// 인스턴스 클래스에서 정적 멤버는 선언이 불가능하다.
		void method1() { }
		// static void method2() { }	// 인스턴스 클래스에서 정적 멤버는 선언이 불가능하다.
	}
	
	/** 정적 멤버 클래스 **/
	static class C {
		C() { System.out.println("C 객체가 생성됨."); }
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		/** 로컬 클래스 **/
		class D {
			D() { System.out.println("D 객체가 생성됨."); }
			int field1;
			// static int field2;			// 로컬 클래스에서 static 또는 접근제한자는 사용할 수 없다.
			void method1() { }
			// static void method2() { }	// 로컬 클래스에서 static 또는 접근제한자는 사용할 수 없다.
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
