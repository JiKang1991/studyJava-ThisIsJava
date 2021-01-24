package inheritance;
/**
 * 상속받은 메소드를 자식 클래스에서 오버라이딩 하는 예제 (자식클래스)
 * @author jikang
 *
 */
public class OverrideMethodComputer extends OverrideMethodCalculator{
	// 메소드가 정확히 오버라이딩 된 것인지 체크한다.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		// 부모 클래스에 선언되어있는 '3.14159' 보다 정밀한 계산을 위해
		// 'Math.PI' 상수를 이용한다.
		return Math.PI * r * r;
	}
	
}
