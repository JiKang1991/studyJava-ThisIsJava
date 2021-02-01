package anonymousObjcet.inheritanceClass;
/**
 * 익명 자식 객체 선언 및 호출 예제 ( 생성, 호출 클래스 )
 * @author jikang
 *
 */
public class AnonymousRuntime {
	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		// 익명 객체 필드 사용
		annoy.field.wake();
		
		// 익명 객체 로컬 변수 사용
		annoy.method1();
		
		// 익명 객체 매개값 사용
		annoy.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}

				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}
}
