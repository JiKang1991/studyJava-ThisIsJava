package stringClass;
/**
 * substring() �޼ҵ� Ȱ�� ���� ( ���ڿ� �����ϱ� )
 * @author jikang
 *
 */
public class SubstringExample {
	public static void main(String[] args) {
		String ssn = "123456-098765";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
