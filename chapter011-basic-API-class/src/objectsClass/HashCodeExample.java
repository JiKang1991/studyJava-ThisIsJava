package objectsClass;

import java.util.Objects;

/**
 * hash(), hashCode() �޼ҵ带 Ȱ���ϴ� ����
 * @author jikang
 *
 */
public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
}
