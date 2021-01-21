package classTutorial;
/**
 * 클래스 내부에서 메소드를 호출하는 예제
 * @author jikang
 *
 */
public class CalculatorCallMethodInClass {
	// method
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	// plus() 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);		// avg() 호출
		println("실행결과 : " + result);	// println() 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
