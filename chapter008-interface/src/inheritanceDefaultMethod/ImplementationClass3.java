package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제(자식 인터페이스3 구현 클래스)
 * 부모 인터페이스의 method1, 자식 인터페이스3의 method3,
 * 추상 메소드로 재선언한 method2의 실체 메소드를 모두 가지고 있어야 한다.
 * @author jikang
 *
 */
public class ImplementationClass3 implements ChildInterface3{

	@Override
	public void method1() {
		/* 실행문*/		
	}

	@Override
	public void method2() {
		/* 실행문*/
	}

	@Override
	public void method3() {
		/* 실행문*/
	}
	
}
