package inheritance;
/**
 * 오버라이딩 된 부모 메소드를 super 키워드 사용하여 호출하는 예제(자식클래스 실행)
 * @author jikang
 *
 */
public class CallSuperMethodFastAirplaneRuntime {
	public static void main(String[] args) {
		CallSuperMethodFastAirplane fa = new CallSuperMethodFastAirplane();
		fa.takeOff();
		fa.fly();
		fa.flyMode = CallSuperMethodFastAirplane.SUPERSONIC;
		fa.fly();
		fa.flyMode = CallSuperMethodFastAirplane.NORMAL;
		fa.fly();
		fa.land();
	}
}
