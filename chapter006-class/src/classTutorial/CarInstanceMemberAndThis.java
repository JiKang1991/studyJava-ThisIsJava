package classTutorial;
/**
 * �ν��Ͻ� ����� this Ȱ�� ����
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
			System.out.println(this.model + "�� �޸��ϴ�. (�ü� : " + this.speed + "km/h)");
		}
	}
}
