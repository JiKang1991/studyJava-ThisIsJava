package stringClass;
/**
 * indexOf() �޼ҵ� Ȱ�� ���� ( ���ڿ� ���� ���� ���� )
 * @author jikang
 *
 */
public class IndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�Դϴ�.");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
		}
	}
}
