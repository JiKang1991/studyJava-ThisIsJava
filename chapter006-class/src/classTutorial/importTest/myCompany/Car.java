package classTutorial.importTest.myCompany;
/**
 * 동일한 이름의 클래스가 다른 패키지에 들어있는 경우 import 예제
 * @author jikang
 *
 */

import classTutorial.importTest.hankook.*;
import classTutorial.importTest.hyndai.Engine;
import classTutorial.importTest.kumho.*;

public class Car {
	// field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	classTutorial.importTest.hankook.Tire Tire3 = new classTutorial.importTest.hankook.Tire();
	classTutorial.importTest.kumho.Tire Tire4 = new classTutorial.importTest.kumho.Tire();
	
}
