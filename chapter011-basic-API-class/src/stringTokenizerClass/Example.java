package stringTokenizerClass;

import java.util.StringTokenizer;

/**
 * StringTokenizerClass 활용 예제
 * @author jikang
 *
 */
public class Example {
	public static void main(String[] args) {
		String text = "짱구/팽수/가제트";
		
		// how1 : 전체 토큰 수를 얻어 for문으로 루핑한다.
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens =  st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		// how2 : 남아 있는 토큰을 확인하고 while 문으로 루핑한다.
		st = new StringTokenizer(text, "/");
		while( st.hasMoreTokens() ) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
