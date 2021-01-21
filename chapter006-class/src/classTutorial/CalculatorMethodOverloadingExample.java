package classTutorial;
/**
 * 메소드 오버로딩 실행 예제
 * @author jikang
 *
 */
public class CalculatorMethodOverloadingExample {
	public static void main(String[] args) {
		CalculatorMethodOverloading myCalcu = new CalculatorMethodOverloading();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}
}
