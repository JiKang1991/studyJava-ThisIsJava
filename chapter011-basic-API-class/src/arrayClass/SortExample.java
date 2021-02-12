package arrayClass;

import java.util.Arrays;

/**
 * sort() 메소드 활용 예제( 호출 및 실행 클래스 )
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
		
		String[] names = { "팽수", "짱구", "도라애몽" };
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		SortMember m1 = new SortMember("팽수");
		SortMember m2 = new SortMember("짱구");
		SortMember m3 = new SortMember("도라애몽");
		SortMember[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i = 0; i < members.length; i++) {
			System.out.println("members [" + i + "].name = " + members[i].name);
		}
	}
}
