package classTutorial;
/**
 * 클래스 외부에서 메소드를 호출하는 예제
 * @author jikang
 *
 */
public class CarCallMethodOutClass {
	// field
	int speed;
	
	// constructor
	
	// method
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 0; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
}
