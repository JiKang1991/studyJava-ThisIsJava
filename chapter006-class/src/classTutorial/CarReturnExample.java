package classTutorial;
/**
 * return���� ����Ǿ��ִ� method�� ȣ���ϴ� ����
 * @author jikang
 *
 */
public class CarReturnExample {
	public static void main(String[] args) {
		CarReturn myCar = new CarReturn();
		
		// CarReturn�� setGas() �޼ҵ� ȣ��
		myCar.setGas(5);
		
		// CarReturn�� isLeftGas() �޼ҵ� ȣ��
		boolean gasState = myCar.isLeftgas();
		if(gasState) {
			System.out.println("start");
			// CarRetrun�� run() �޼ҵ� ȣ��
			myCar.run();
		}
		
		// CarReturn�� isLeftGas() �޼ҵ� ȣ��
		if(myCar.isLeftgas()) {
			System.out.println("gas is left");
		} else {
			System.out.println("need to repl gas");
		}
	}
}
