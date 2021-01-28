package interfaceArray;

import polymorphismOfField.KTire;

/**
 * 인터페이스 배열을 활용하는 예제
 * @author jikang
 *
 */
public class CarRuntime {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KTire();
		myCar.tires[1] = new KTire();
		
		myCar.run();
	}
}
