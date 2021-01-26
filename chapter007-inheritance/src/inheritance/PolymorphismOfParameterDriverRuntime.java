package inheritance;
/**
 * 매개변수에 다형성을 적용하는 예제(실행 클래스)
 * @author jikang
 *
 */
public class PolymorphismOfParameterDriverRuntime {
	public static void main(String[] args) {
		PolymorphismOfParameterDriver driver = new PolymorphismOfParameterDriver();
		
		PolymorphismOfParameterBus bus = new PolymorphismOfParameterBus();
		PolymorphismOfParameterTaxi taxi = new PolymorphismOfParameterTaxi();
		
		driver.drive(bus);	// 자동타입변환
		driver.drive(taxi); // 자동타입변환
	}
}
