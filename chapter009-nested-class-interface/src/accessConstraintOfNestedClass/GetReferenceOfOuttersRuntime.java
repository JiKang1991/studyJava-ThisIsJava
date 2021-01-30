package accessConstraintOfNestedClass;
/**
 * 중첩 클래스에서 바깥 클래스 참조를 얻는 예제(실행 클래스)
 * @author jikang
 *
 */
public class GetReferenceOfOuttersRuntime {
	public static void main(String[] args) {
		GetReferenceOfOutters outter = new GetReferenceOfOutters();
		GetReferenceOfOutters.Nested nested = outter.new Nested();
		nested.print();
	}
}
