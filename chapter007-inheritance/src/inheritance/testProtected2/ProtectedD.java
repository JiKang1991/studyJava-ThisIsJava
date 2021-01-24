package inheritance.testProtected2;

import inheritance.testProtected1.ProtectedA;

/**
 * 다른 패키지에서 상속 관계인 부모 클래스의 protected 선언되어있는 멤버에 접근하는 예제
 * @author jikang
 *
 */
public class ProtectedD extends ProtectedA{
	public ProtectedD() {
		super();				// 생성자 접근 가능
		this.field = "value";	// 필드 접근 가능
		this.method(); 			// 메소드 접근 가능
	}
}
