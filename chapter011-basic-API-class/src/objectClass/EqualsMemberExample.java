package objectClass;
/**
 * equals() �޼ҵ� ��� ����( ȣ�� �� ���� Ŭ���� )
 * @author jikang
 *
 */
public class EqualsMemberExample {
	public static void main(String[] args) {
		EqualsMember obj1 = new EqualsMember("blue");
		EqualsMember obj2 = new EqualsMember("blue");
		EqualsMember obj3 = new EqualsMember("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}
}
