package anonymousObjcet.inheritanceInterface;
/**
 * 익명 구현 클래스 선언 및 객체 생성과 호출 예제(생성 및 호출 클래스)
 * @author jikang
 *
 */
public class AnonymousRuntime {
	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		
		// 익명 객체 필드 사용
		annoy.field.turnOn();
		
		// 익명 객체 로컬 변수 사용
		annoy.method1();
		
		// 익명 객체 매개값 사용
		annoy.method2(
			new RemoteControl() {
				
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}
				
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
			}
		);
		
	}
}
