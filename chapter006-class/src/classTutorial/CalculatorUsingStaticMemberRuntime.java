package classTutorial;
/**
 * 정적 멤버를 사용하여 선언한 클래스를 실행하는 예제
 * @author jikang
 *
 */
public class CalculatorUsingStaticMemberRuntime {
	public static void main(String[] args) {
		double result1 = 10 * 10 * CalculatorUsingStaticMember.pi;
		int result2 = CalculatorUsingStaticMember.plus(10, 5);
		int result3 = CalculatorUsingStaticMember.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}
}
