package objectClass;
/**
 * finalize() �޼ҵ� Ȱ�� ���� ( finalize() �޼ҵ� ������(�������̵�) Ŭ���� )
 * @author jikang
 *
 */
public class FinalizeCounter {
	public int no;

	public FinalizeCounter(int no) {
		super();
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
	
	
	
}
