package casting;
/**
 * 캐스팅으로 인터페이스 구현 객체의 메소드를 호출하는 예제(실행클래스)
 * @author jikang
 *
 */
public class VehicleRuntime {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 	// Bus의 메소드는 사용할 수 없다.
		
		Bus bus = (Bus)vehicle;	// 강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}
}
