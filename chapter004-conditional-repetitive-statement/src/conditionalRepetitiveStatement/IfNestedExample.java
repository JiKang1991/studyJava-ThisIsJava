package conditionalRepetitiveStatement;
/**
 * 81 <= ... <= 100 사이에 속하는 점수를 뽑아내어
 * 바깥 if문은 90점과 80점을 기준으로 조건문을 작성하고,
 * 중첩 if문은 좀더 세부적으로 95점과 85점을 기준으로 조건문을 작성해서
 * A+, A, B+, B를 출력하는 예제
 * 
 * @author jikang
 *
 */
public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("점수 : " + score);
		String grade;
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} 
		System.out.println("학점 : " + grade);
	}
}
