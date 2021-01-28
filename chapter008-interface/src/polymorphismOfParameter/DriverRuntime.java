package polymorphismOfParameter;
/**
 * 인터페이스를 사용한 매개변수 다형성 확인 예제
 * @author jikang
 *
 */
public class DriverRuntime {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
