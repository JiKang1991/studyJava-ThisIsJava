package objectsClass;

import java.util.Objects;

/**
 * toString() �޼ҵ� Ȱ�� ����
 * @author jikang
 *
 */
public class TostringExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));
	}
}
