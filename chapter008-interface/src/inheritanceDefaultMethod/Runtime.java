package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제 ( 실행 클래스 )
 * @author jikang
 *
 */
public class Runtime {
	public static void main(String[] args) {
		// ImplementationClass1 호출
		ImplementationClass1 ic1 = new ImplementationClass1();
		ic1.method1();
		ic1.method2(); 		// 부모인터페이스의 디폴트메소드 호출
		ic1.method3();
		
		// ImplementationClass2 호출
		ImplementationClass2 ic2 = new ImplementationClass2();
		ic2.method1();
		ic2.method2(); 		// 자식인터페이스2에서 재정의한 메소드 호출
		ic2.method3();
				
		// ImplementationClass3 호출
		ImplementationClass3 ic3 = new ImplementationClass3();
		ic3.method1();
		ic3.method2(); 		// 자식인터페이스3에서 추상메소드로 재정의한 메소드 호출
		ic3.method3();
	}
}
