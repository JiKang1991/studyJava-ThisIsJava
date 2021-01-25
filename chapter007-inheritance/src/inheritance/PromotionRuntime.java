package inheritance;
/**
 * 상속관계의 자동타입변환을 확인하는 예제
 * @author jikang
 *
 */
// 상속관계의 부모 자식 클래스 선언
class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionRuntime {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// B b3 = e;	// 컴파일에러, 상속관계가 아니다
		// C c1 = d;	// 컴파일에러, 상속관계가 아니다
	}
}
