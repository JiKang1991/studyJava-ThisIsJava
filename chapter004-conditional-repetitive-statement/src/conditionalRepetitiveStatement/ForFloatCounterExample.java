package conditionalRepetitiveStatement;
/**
 * for문에서 float 타입 카운터 변수를 사용하는 예제
 * @author jikang
 *
 */
public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}
