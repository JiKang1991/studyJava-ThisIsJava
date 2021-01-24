package inheritance;
/**
 * 상속받은 메소드를 자식 클래스에서 오버라이딩 하는 예제 (자식 객체 실행)
 * @author jikang
 *
 */
public class OverrideMethodComputerRuntime {
	public static void main(String[] args) {
		int r = 10;
		
		OverrideMethodCalculator calculator = new OverrideMethodCalculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		OverrideMethodComputer computer = new OverrideMethodComputer();
		System.out.println("원면적 : " + computer.areaCircle(r));		// 재정의된 메소드 호출
	}
}
