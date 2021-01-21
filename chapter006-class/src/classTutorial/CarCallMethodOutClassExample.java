package classTutorial;
/**
 * 외부에서 메소드를 호출하는 객체의 메소드를 호출하는 예제
 * @author jikang
 *
 */
public class CarCallMethodOutClassExample {
	public static void main(String[] args) {
		CarCallMethodOutClass myCar = new CarCallMethodOutClass();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}
}
