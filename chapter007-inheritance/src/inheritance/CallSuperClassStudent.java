package inheritance;
/**
 * �θ� Ŭ������ �����ڸ� ȣ���ϴ� �ڽ� Ŭ���� ����
 * @author jikang
 *
 */
public class CallSuperClassStudent extends CallSuperClassPeople{
	// field
	public int studentNo;
	
	// constructor
	public CallSuperClassStudent(String name, String ssn, int studentNo) {
		super(name, ssn);		// �θ� ������ ȣ��
		this.studentNo = studentNo;
	}
}
