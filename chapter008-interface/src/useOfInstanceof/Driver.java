package useOfInstanceof;

import casting.Bus;
import casting.Vehicle;

/**
 * instanceof 연산자를 사용하여 구현 객체를 확인하는 예제
 * @author jikang
 *
 */
public class Driver {
	public void drive(Vehicle vehicle) {	// Bus or Taxi 구현 객체가 전달 될 수 있다.
		if(vehicle instanceof Bus) {		// vehicle 매개변수가 참조하는 객체가 Bus인지 조사한다.
			Bus bus = (Bus)vehicle;			// Bus 객체일 경우 안전하게 강제 타입 변환한다.
			bus.checkFare(); 	// Bus 타입으로 강제 타입변환 하는 이유
		}
	}
}
