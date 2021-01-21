package classTutorial;
/**
 * 정적 멤버를 사용하여 클래스를 선언하는 예제
 * @author jikang
 *
 */
public class CalculatorUsingStaticMember {
	// declaration of static field
	static double pi = 3.14159;
	
	// declaration of static method
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
