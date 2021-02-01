package useLocalVariableOfAnonymousObjcet;
/**
 * 익명 객체에서 로컬 변수를 사용하는 예제( 익명 클래스 선언 클래스 )
 * @author jikang
 *
 */
public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20;			// final 특성을 가지고 있어서 대입 할 수 없다.
		// arg2 = 20;			// final 특성을 가지고 있어서 대입 할 수 없다.

		// var1 = 30;			// final 특성을 가지고 있어서 대입 할 수 없다.
		// var2 = 30;			// final 특성을 가지고 있어서 대입 할 수 없다.
		
		Calculatable clac = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(clac.sum());
	}
}
