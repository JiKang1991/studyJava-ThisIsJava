package conditionalRepetitiveStatement;
/**
 * for문을 이용하여 1 부터 100 까지의 합을 출력하는 예제
 * @author jikang
 *
 */
public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;	// 합계 변수
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : " + sum);
	}
}
