package inheritance;
/**
 * �θ� Ŭ������ �����ڸ� ȣ���ϴ� �ڽ� Ŭ������ �̿��ϴ� ����
 * @author jikang
 *
 */
public class CallSuperClassStudentRuntime {
	public static void main(String[] args) {
		CallSuperClassStudent student = new CallSuperClassStudent("�Ѹ�", "123123-456456", 1);
		System.out.println("name : " + student.name);		// �θ� ��ü���� �������� �ʵ� ���
		System.out.println("ssn : " + student.ssn);			// �θ� ��ü���� �������� �ʵ� ���
		System.out.println("studentNo : " + student.studentNo );		
	}
}
