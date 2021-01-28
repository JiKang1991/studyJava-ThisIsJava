package defaultMethod;
/**
 * 디폴트 메소드 활용 예제(구현 클래스B)
 * @author jikang
 *
 */
public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	// 디폴트 메소드 재정의
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
	
}
