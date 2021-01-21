package classTutorial;
/**
 * 인스턴스 멤버와 this 활용 예제
 * @author jikang
 *
 */
public class CarInstanceMemberAndThis {
	// field
	String model;
	int speed;
	
	// constructor
	CarInstanceMemberAndThis(String model){
		this.model = model;
	}
	
	// method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}
}
