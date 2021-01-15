package conditionalRepetitiveStatement;
/**
 * char 타입 변수를 switch문에 적용하는 예제
 * @author jikang
 *
 */
public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		// 영어 대소문자 상관없이 똑같은 알파벳이라면 동일하게 처리한다.
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
	}
}
