package operator;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다."); // 0.3 (x)	0.29999999999999993(o)
		// 부동 소수점 타입은 0.1을 정확히 표현할 수 없어 근사치로 처리하기 때문이다.
	}
}
