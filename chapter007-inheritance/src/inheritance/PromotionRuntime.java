package inheritance;
/**
 * ��Ӱ����� �ڵ�Ÿ�Ժ�ȯ�� Ȯ���ϴ� ����
 * @author jikang
 *
 */
// ��Ӱ����� �θ� �ڽ� Ŭ���� ����
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
		
		// B b3 = e;	// �����Ͽ���, ��Ӱ��谡 �ƴϴ�
		// C c1 = d;	// �����Ͽ���, ��Ӱ��谡 �ƴϴ�
	}
}
