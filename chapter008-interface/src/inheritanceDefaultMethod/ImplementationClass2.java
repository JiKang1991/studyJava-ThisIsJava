package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제(자식 인터페이스2 구현 클래스)
 * 부모 인터페이스의 method1, 자식 인터페이스2의 method3의 실체 메소드를 가지고 있어야 한다.
 * 자식 인터페이스2에서 재정의한 method2를 호출할 수 있다.
 * @author jikang
 *
 */
public class ImplementationClass2 implements ChildInterface2{

	@Override
	public void method1() {
		/* 실행문 */
	}

	@Override
	public void method3() {
		/* 실행문 */
	}
	
}
