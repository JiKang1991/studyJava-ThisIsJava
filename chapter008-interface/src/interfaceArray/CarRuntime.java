package interfaceArray;

import polymorphismOfField.KTire;

/**
 * �������̽� �迭�� Ȱ���ϴ� ����
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
