package stringClass;
/**
 * split() �޼ҵ� ����
 * @author jikang
 *
 */
public class SplitExample {
	public static void main(String[] args) {
		String text = "�ؼ�&¯��,���۸�,��Ʈ��-�����̴���";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
