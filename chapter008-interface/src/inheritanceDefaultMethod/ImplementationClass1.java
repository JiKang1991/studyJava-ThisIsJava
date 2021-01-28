package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제 (자식인터페이스1 구현 클래스)
 * 부모 인터페이스의 method1, 자식인터페이스1의 method3을 가지고 있어야 하며
 * 부모 인터페이스의 디폴트 메소드인 method2를 호출할 수 있다.
 * @author jikang
 *
 */
public class ImplementationClass1 implements ChildInterface1{
	 
	@Override
	public void method1() {
		/* 실행문 */
	}

	@Override
	public void method3() {
		/* 실행문 */
	}	
}
