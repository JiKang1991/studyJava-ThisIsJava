package inheritance;
/**
 * 매개변수에 다형성을 적용하는 예제(자식클래스1)
 * @author jikang
 *
 */
public class PolymorphismOfParameterBus extends PolymorphismOfParameterVehicle {

	@Override
	public void run() {
		System.out.println("버스 주행중");
	}
	
}
