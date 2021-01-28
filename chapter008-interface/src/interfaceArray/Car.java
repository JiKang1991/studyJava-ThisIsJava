package interfaceArray;

import polymorphismOfField.HTire;
import polymorphismOfField.Tire;

/**
 * �������̽� �迭�� Ȱ���ϴ� ����
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
