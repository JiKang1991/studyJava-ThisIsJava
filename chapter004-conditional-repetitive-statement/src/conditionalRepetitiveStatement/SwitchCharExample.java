package conditionalRepetitiveStatement;
/**
 * char Ÿ�� ������ switch���� �����ϴ� ����
 * @author jikang
 *
 */
public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		// ���� ��ҹ��� ������� �Ȱ��� ���ĺ��̶�� �����ϰ� ó���Ѵ�.
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}
	}
}
