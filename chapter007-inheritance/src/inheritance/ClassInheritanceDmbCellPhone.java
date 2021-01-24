package inheritance;
/**
 * ClassInheritanceCellPhone 클래스를 상속받는 자식 클래스를 선언하는 예제
 * @author jikang
 *
 */
public class ClassInheritanceDmbCellPhone extends ClassInheritanceCellPhone {
	// field
	int channel;
	
	// constructor
	ClassInheritanceDmbCellPhone(String model, String color, int channel){
		this.model = model;		// ClassInheritanceCellPhone로부터 상속받은 필드
		this.color = color;		// ClassInheritanceCellPhone로부터 상속받은 필드
		this.channel = channel;
	}
		
	// method
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
