package stringClass;
/**
 * replace() �޼ҵ� Ȱ�� ���� ( ���ڿ� ��ġ�ϱ� )
 * @author jikang
 *
 */
public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
