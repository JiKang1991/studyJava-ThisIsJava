package casting;
/**
 * ĳ�������� �������̽� ���� ��ü�� �޼ҵ带 ȣ���ϴ� ����(����Ŭ����)
 * @author jikang
 *
 */
public class VehicleRuntime {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 	// Bus�� �޼ҵ�� ����� �� ����.
		
		Bus bus = (Bus)vehicle;	// ���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();
	}
}
