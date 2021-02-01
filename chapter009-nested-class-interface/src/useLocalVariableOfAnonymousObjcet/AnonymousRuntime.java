package useLocalVariableOfAnonymousObjcet;
/**
 * 익명 객체에서 로컬 변수를 사용한는 예제 ( 익명 객체 생성 및 호출 클래스 )
 * @author jikang
 *
 */
public class AnonymousRuntime {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}
	
}
