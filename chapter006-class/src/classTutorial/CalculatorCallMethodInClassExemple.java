package classTutorial;
/**
 * 객체 내부에서 메소드를 호출하는 객체를 실행시키는 예제 
 * @author jikang
 *
 */
public class CalculatorCallMethodInClassExemple {
	public static void main(String[] args) {
		CalculatorCallMethodInClass myCalc = new CalculatorCallMethodInClass();
		myCalc.execute();	// CalculatorCallMethodInClass의 execute() 실행
	}
}
