package inhertance;
/**
 * 매개변수에 다형성을 적용하는 예제(자식클래스2)
 * @author jikang
 *
 */
public class PolymorphismOfParameterTaxi extends PolymorphismOfParameterVehicle{

	@Override
	public void run() {
		System.out.println("택시 주행중");
	}
	
}
