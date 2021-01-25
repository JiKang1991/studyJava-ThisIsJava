package inheritance;
/**
 * ���� Ÿ�� ��ȯ ���� ���� Ŭ����
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
		parent.field2 = "data2";	// ��� �Ұ���
		parent.method3();			// ��� �Ұ���
		*/
		
		CastingChild child = (CastingChild) parent;		// ���� Ÿ�� ��ȯ
		child.field2 = "yyy";		// ��� ����
		child.method3(); 			// ��� ����
	}
}
