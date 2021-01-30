package accessConstraintOfNestedClass;
/**
 * ���� Ŭ�������� �ٱ� Ŭ������ �޼ҵ� ��� ����
 * @author jikang
 *
 */
public class AtLocalClass {
	// �ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; 				// final�� ����Ǿ� ���� �� �� ����.
		// localVariable = 100;		// final�� ����Ǿ� ���� �� �� ����.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// �ڹ� 8 ����
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;				// ���� Ŭ������ ������ ����Ǵ� ���� ������ final Ư���� ������ �ǹǷ� ������ �� ����.
		// localVariable = 100;		// ���� Ŭ������ ������ ����Ǵ� ���� ������ final Ư���� ������ �ǹǷ� ������ �� ����.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
