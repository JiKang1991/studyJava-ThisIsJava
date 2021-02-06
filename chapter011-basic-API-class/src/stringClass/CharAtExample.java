package stringClass;
/**
 * charAt() 메소드 활용 예제 ( 주민등록번호에서 남자와 여자를 구분하는 방법 )
 * @author jikang
 *
 */
public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "392023-123456";
		char gender = ssn.charAt(7);
		switch(gender) {
			case '1':
			case '3':
				System.out.println("남성입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여성입니다.");
				break;
		}
	}
}
