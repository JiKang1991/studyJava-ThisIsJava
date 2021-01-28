package defaultMethod;
/**
 * 디폴트 메소드 활용 예제(인터페이스)
 * @author jikang
 *
 */
public interface MyInterface {
	// before modify
	public void method1();
	
	// after modify 
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
