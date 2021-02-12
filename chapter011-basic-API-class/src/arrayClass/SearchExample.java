package arrayClass;

import java.util.Arrays;

/**
 * binarySearch() 메소드 활용 예제
 * @author jikang
 *
 */
public class SearchExample {
	public static void main(String[] args) {
		// 기본 타입값 검색
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스 : " + index);
		
		// 문자열 검색
		String[] names = {"팽수", "짱구", "태권브이"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "태권브이");
		System.out.println("찾은 인덱스 : " + index);
		
		// 객체 검색
		SortMember m1 = new SortMember("팽수");
		SortMember m2 = new SortMember("짱구");
		SortMember m3 = new SortMember("태권브이");
		SortMember[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m3);
		System.out.println("찾은 인덱스 : " + index);
	}
}
