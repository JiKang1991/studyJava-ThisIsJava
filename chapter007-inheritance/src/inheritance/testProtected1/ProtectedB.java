package inheritance.testProtected1;
/** 
 * 같은 패키지에서 다른 클래스의 protected 선언되어있는 멤버에 접근하는 예제 
 * @author jikang
 *
 */
public class ProtectedB {
	public void method() {
		ProtectedA a = new ProtectedA();		// 접근 가능
		a.field = "value";						// 접근 가능
		a.method();								// 접근 가능
	}
}
