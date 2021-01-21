package classTutorial;
/**
 * 인스턴스 멤버와 this를 활용한 객체 호출 예제
 * @author jikang
 *
 */
public class CarInstanceMemberAndThisExample {
	public static void main(String[] args) {
		CarInstanceMemberAndThis myCar = new CarInstanceMemberAndThis("포르쉐");
		CarInstanceMemberAndThis yourCar = new CarInstanceMemberAndThis("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
