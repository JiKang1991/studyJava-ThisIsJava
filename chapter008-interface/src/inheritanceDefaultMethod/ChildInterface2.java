package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제(자식 인터페이스2)
 * @author jikang
 *
 */
public interface ChildInterface2 extends ParentInterface{
	
	// 디폴트 메소드 재정의
	@Override
	default void method2() {
		/* 실행문 */
	}
	
	public void method3();
	
}
