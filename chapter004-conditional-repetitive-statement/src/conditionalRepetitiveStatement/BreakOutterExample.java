package conditionalRepetitiveStatement;
/**
 * 중첩 for문 중 바깥쪽 for문은 'A' ~ 'Z'를 반복하고
 * 안쪽 for문은 'a' ~ 'z'를 반복하는데 lower변수가 'g'를 갖게되면
 * 바깥쪽 for문 까지 빠져나오는 예제
 * @author jikang
 *
 */
public class BreakOutterExample {
	public static void main(String[] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
