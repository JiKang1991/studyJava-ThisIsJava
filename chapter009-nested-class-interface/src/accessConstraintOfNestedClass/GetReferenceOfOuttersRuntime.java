package accessConstraintOfNestedClass;
/**
 * ��ø Ŭ�������� �ٱ� Ŭ���� ������ ��� ����(���� Ŭ����)
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
