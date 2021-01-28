package useOfInstanceof;

import casting.Bus;
import casting.Vehicle;

/**
 * instanceof �����ڸ� ����Ͽ� ���� ��ü�� Ȯ���ϴ� ����
 * @author jikang
 *
 */
public class Driver {
	public void drive(Vehicle vehicle) {	// Bus or Taxi ���� ��ü�� ���� �� �� �ִ�.
		if(vehicle instanceof Bus) {		// vehicle �Ű������� �����ϴ� ��ü�� Bus���� �����Ѵ�.
			Bus bus = (Bus)vehicle;			// Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ�Ѵ�.
			bus.checkFare(); 	// Bus Ÿ������ ���� Ÿ�Ժ�ȯ �ϴ� ����
		}
	}
}
