package inheritanceOfInterface;
/**
 * 인터페이스 상속 예제 ( 실행 클래스 )
 * @author jikang
 *
 */
public class Runtime {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		ImplementationC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
