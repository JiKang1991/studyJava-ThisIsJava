package objectClass;
/**
 * finalize() �޼ҵ� Ȱ�� ���� ( finalize() �޼ҵ� ������ ��ü ���� ����)
 * @author jikang
 *
 */
public class FinalizeExample {
	public static void main(String[] args) {
		FinalizeCounter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new FinalizeCounter(i);
			// Counter ��ü�� ������� ����
			counter = null;
			// garbage collector ���� ��û
			System.gc();
		}
	}
}
