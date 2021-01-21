package classTutorial;
/**
 * 매개 변수의 수를 모를경우 메소드 작성 예제
 * @author jikang
 *
 */
public class Computer {
	// method
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
