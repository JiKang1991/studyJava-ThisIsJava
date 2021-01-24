package inheritance.testProtected2;

import inheritance.testProtected1.ProtectedA;

/**
 * 다른 패키지에서 다른 클래스의 protected 선언되어있는 멤버에 접근하는 예제
 * @author jikang
 *
 */
public class ProtectedC {
	public void method() {
		ProtectedA a = new ProtectedA();		// 접근 불가
		a.field = "value";						// 접근 불가
		a.method();								// 접근 불가
	}
}
