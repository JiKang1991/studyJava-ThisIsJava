package inheritance;
/**
 * 자동 타입 변환 후의 멤버 접근을 확인하는 예제(자식 클래스)
 * @author jikang
 *
 */
public class PromotionChild extends PromotionParent{

	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	
}
