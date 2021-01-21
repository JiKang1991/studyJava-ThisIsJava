package classTutorial;
/**
 * return문이 선언되어있는 method를 호출하는 예제
 * @author jikang
 *
 */
public class CarReturnExample {
	public static void main(String[] args) {
		CarReturn myCar = new CarReturn();
		
		// CarReturn의 setGas() 메소드 호출
		myCar.setGas(5);
		
		// CarReturn의 isLeftGas() 메소드 호출
		boolean gasState = myCar.isLeftgas();
		if(gasState) {
			System.out.println("start");
			// CarRetrun의 run() 메소드 호출
			myCar.run();
		}
		
		// CarReturn의 isLeftGas() 메소드 호출
		if(myCar.isLeftgas()) {
			System.out.println("gas is left");
		} else {
			System.out.println("need to repl gas");
		}
	}
}
