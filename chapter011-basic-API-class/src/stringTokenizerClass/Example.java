package stringTokenizerClass;

import java.util.StringTokenizer;

/**
 * StringTokenizerClass Ȱ�� ����
 * @author jikang
 *
 */
public class Example {
	public static void main(String[] args) {
		String text = "¯��/�ؼ�/����Ʈ";
		
		// how1 : ��ü ��ū ���� ��� for������ �����Ѵ�.
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens =  st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		// how2 : ���� �ִ� ��ū�� Ȯ���ϰ� while ������ �����Ѵ�.
		st = new StringTokenizer(text, "/");
		while( st.hasMoreTokens() ) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
