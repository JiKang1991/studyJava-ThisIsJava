package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제 (자식 인터페이스3)
 * @author jikang
 *
 */
public interface ChildInterface3 extends ParentInterface{

	@Override
	public void method2();	// 추상메소드로 재선언
	public void method3();
	
}
