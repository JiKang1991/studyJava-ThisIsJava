package conditionalRepetitiveStatement;
/**
 * 중첩 for문을 사용하여 구구단을 출력하는 예제 
 * @author jikang
 *
 */
public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
