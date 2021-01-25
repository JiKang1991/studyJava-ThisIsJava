package inheritance;
/**
 * 자동 타입 변환 후의 멤버 접근을 확인하는 예제(자식 클래스 생성 및 호출) 
 * @author jikang
 *
 */
public class PromotionChildRuntime {
	public static void main(String[] args) {
		PromotionChild child = new PromotionChild();	// 자식객체 생성
		
		PromotionParent parent = child;		// 자동 타입 변환
		parent.method1();
		parent.method2();					// 오버라이드(재정의)된 메소드가 호출된다.
		// parent.method3();				// 자식 클래스의 객체로, 호출할 수 없다
	}
}
