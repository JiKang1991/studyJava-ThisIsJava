package stringBuilder;
/**
 * StringBuilder 클래스 활용 예제
 * @author jikang
 *
 */
public class Example {
	public static void main(String[] args) {
		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();	
		
		// 문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());
		
		// index 4 위치 뒤에 2를 삽입
		sb.insert(4, "2");
		
		System.out.println(sb.toString());
		
		// index 4 위치의 문자를 6으로 면경
		sb.setCharAt(4, '6');
		
		System.out.println(sb.toString());
		
		// index 6 부터 index 13 '전'까지를 "Book"문자열로 대치
		sb.replace(6, 13, "Book");
		
		System.out.println(sb.toString());
		
		// index 4부터 index 5 '전'까지 삭제
		sb.delete(4, 5);
		
		System.out.println(sb.toString());
		
		// 총 문자수 얻기
		int length = sb.length();
		
		System.out.println("총 문자수 : " + length);
		
		// 버퍼에 있는 것을 String 타입으로 리턴
		String result = sb.toString();
		
		System.out.println(result);
	}
}
