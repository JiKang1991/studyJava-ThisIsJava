package inheritance;
/**
 * 상속받은 메소드를 자식 클래스에서 오버라이딩 하는 예제 (부모클래스)
 * @author jikang
 *
 */
public class OverrideMethodCalculator {
	double areaCircle(double r) {
		System.out.println("calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
