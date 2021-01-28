package inheritanceOfInterface;
/**
 * 인터페이스 상속 예제 (하위 인터페이스 구현 클래스)
 * @author jikang
 *
 */
public class ImplementationC implements InterfaceC {
	// InterfaceA, B의 실체 메소드도 있어야 한다.
	@Override
	public void methodA() {
		System.out.println("ImplementationC - methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC - methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC - methodC() 실행");
	}
	
}
