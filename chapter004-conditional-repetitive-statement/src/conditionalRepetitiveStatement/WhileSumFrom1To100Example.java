package conditionalRepetitiveStatement;
/**
 * while문 사용하여 1 부터 100까지 합을 계산하는 예제
 * @author jikang
 *
 */
public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;	// 합계를 저장할 변수
		
		int i = 1;		// 커운터 변수
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ " + (i-1) + " 합 : " + sum);
		
	}
}
