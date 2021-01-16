package conditionalRepetitiveStatement;
/**
 * continue를 사용하여 1~10 중에서 짝수만 출력하는 예제
 * @author jikang
 *
 */
public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			// 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);	// 홀수는 실행되지 않는다.
		}
	}
}
