package arrayClass;

import java.util.Arrays;

/**
 * binarySearch() �޼ҵ� Ȱ�� ����
 * @author jikang
 *
 */
public class SearchExample {
	public static void main(String[] args) {
		// �⺻ Ÿ�԰� �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε��� : " + index);
		
		// ���ڿ� �˻�
		String[] names = {"�ؼ�", "¯��", "�±Ǻ���"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "�±Ǻ���");
		System.out.println("ã�� �ε��� : " + index);
		
		// ��ü �˻�
		SortMember m1 = new SortMember("�ؼ�");
		SortMember m2 = new SortMember("¯��");
		SortMember m3 = new SortMember("�±Ǻ���");
		SortMember[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m3);
		System.out.println("ã�� �ε��� : " + index);
	}
}
