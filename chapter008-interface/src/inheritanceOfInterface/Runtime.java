package inheritanceOfInterface;
/**
 * �������̽� ��� ���� ( ���� Ŭ���� )
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
