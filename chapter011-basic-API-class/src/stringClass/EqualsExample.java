package stringClass;
/**
 * equals() �޼ҵ� Ȱ�� ����
 * @author jikang
 *
 */
public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("study Java");
		String strVar2 = "study Java";
		
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� �����մϴ�.");
		} else {
			System.out.println("�ٸ� String ��ü�� �����մϴ�.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ������ �ֽ��ϴ�.");
		} else {
			System.out.println("�ٸ� ���ڿ��� ������ �ֽ��ϴ�.");
		}
	}
}
