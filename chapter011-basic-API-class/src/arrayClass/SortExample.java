package arrayClass;

import java.util.Arrays;

/**
 * sort() �޼ҵ� Ȱ�� ����( ȣ�� �� ���� Ŭ���� )
 * @author jikang
 *
 */
public class SortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] names = { "�ؼ�", "¯��", "����ָ�" };
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		SortMember m1 = new SortMember("�ؼ�");
		SortMember m2 = new SortMember("¯��");
		SortMember m3 = new SortMember("����ָ�");
		SortMember[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i = 0; i < members.length; i++) {
			System.out.println("members [" + i + "].name = " + members[i].name);
		}
	}
}
