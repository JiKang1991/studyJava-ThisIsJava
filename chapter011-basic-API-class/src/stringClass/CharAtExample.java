package stringClass;
/**
 * charAt() �޼ҵ� Ȱ�� ���� ( �ֹε�Ϲ�ȣ���� ���ڿ� ���ڸ� �����ϴ� ��� )
 * @author jikang
 *
 */
public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "392023-123456";
		char gender = ssn.charAt(7);
		switch(gender) {
			case '1':
			case '3':
				System.out.println("�����Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("�����Դϴ�.");
				break;
		}
	}
}
