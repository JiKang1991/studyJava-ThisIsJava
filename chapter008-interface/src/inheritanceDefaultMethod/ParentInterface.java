package inheritanceDefaultMethod;
/**
 * 디폴트 메소드 상속 예제(부모 인터페이스)
 * @author jikang
 *
 */
public interface ParentInterface {
	public void method1();
	public default void method2() {/* 실행문 */}
}
