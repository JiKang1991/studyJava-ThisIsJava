package conditionalRepetitiveStatement;
/**
 * 조건식 3개를 이용하여 흐름을 제어하는 예제
 * 
 * @author jikang
 *
 */
public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80) {	// '80 <= score < 90'일 경우
			System.out.println("점수가 89~80 입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {	// '70 <= socre < 80'일 경우
			System.out.println("점수가 79~70 입니다.");
			System.out.println("등급은 C입니다.");
		} else {					// 'score < 70'일 경우
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}
