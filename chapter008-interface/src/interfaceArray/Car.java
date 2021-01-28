package interfaceArray;

import polymorphismOfField.HTire;
import polymorphismOfField.Tire;

/**
 * 인터페이스 배열을 활용하는 예제
 * @author jikang
 *
 */
public class Car {
	// field
	Tire[] tires = {
		new HTire(),
		new HTire(),
		new HTire(),
		new HTire()
	};
	
	// method
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
