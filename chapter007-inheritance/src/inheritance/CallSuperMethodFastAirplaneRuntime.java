package inheritance;
/**
 * �������̵� �� �θ� �޼ҵ带 super Ű���� ����Ͽ� ȣ���ϴ� ����(�ڽ�Ŭ���� ����)
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
