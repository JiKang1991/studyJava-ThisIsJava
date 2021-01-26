package inheritance;
/**
 * 매개변수에 다형성을 적용하는 예제(부모클래스를 이용하는 클래스)
 * @author jikang
 *
 */
public class PolymorphismOfParameterDriver {
	public void drive(PolymorphismOfParameterVehicle vehicle) {
		vehicle.run();
	}
}
