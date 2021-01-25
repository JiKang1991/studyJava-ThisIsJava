package inheritance;
/**
 * 강제 타입 변환 예제 실행 클래스
 * @author jikang
 *
 */
public class CastingChildRuntime {
	public static void main(String[] args) {
		CastingParent parent = new CastingChild();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2";	// 사용 불가능
		parent.method3();			// 사용 불가능
		*/
		
		CastingChild child = (CastingChild) parent;		// 강제 타입 변환
		child.field2 = "yyy";		// 사용 가능
		child.method3(); 			// 사용 가능
	}
}
