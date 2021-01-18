package referenceType;
/**
 * 배열의 length 필드를 사용하는 예제
 * @author jikang
 *
 */
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30 };
		int num = intArray.length;	// num에는 3이 저장된다.
		
		int[] scores = { 83, 90, 87 };
		int sum  = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);		// sum에는 260이 저장되어있다.
		
		double avg = (double) sum / scores.length;	// 260을 3으로 나눈다
		System.out.println("평균 : " + avg);	
	}
}
