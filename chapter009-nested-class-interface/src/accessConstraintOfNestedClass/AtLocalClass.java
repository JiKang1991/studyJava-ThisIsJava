package accessConstraintOfNestedClass;
/**
 * 로컬 클래스에서 바깥 클래스와 메소드 사용 예제
 * @author jikang
 *
 */
public class AtLocalClass {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; 				// final로 선언되어 수정 할 수 없다.
		// localVariable = 100;		// final로 선언되어 수정 할 수 없다.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;				// 로컬 클래스에 변수가 선언되는 순간 변수는 final 특성을 가지게 되므로 수정할 수 없다.
		// localVariable = 100;		// 로컬 클래스에 변수가 선언되는 순간 변수는 final 특성을 가지게 되므로 수정할 수 없다.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
