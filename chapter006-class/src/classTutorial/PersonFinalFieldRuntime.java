package classTutorial;
/**
 * final field�� ������ ��ü�� ȣ���ϴ� ����
 * @author jikang
 *
 */
public class PersonFinalFieldRuntime {
	public static void main(String[] args) {
		PersonFinalField p1 = new PersonFinalField("123-123-123", "��Ŭ����");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";		// �����Ұ�
		//p1.ssm = "321-321-321";	// �����Ұ�
		p1.name = "�ڹ�";
		
	}
}
