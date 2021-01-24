package inheritance;
/**
 * 자식 클래스에게 필드와 메소드를 상속할 부모 클래스를 선언하는 예제
 * @author jikang
 *
 */
public class ClassInheritanceCellPhone {
	// field
	String model;
	String color;
	
	// constructor
	
	// method
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("송신 : " + message); }
	void receiveVoice(String message) { System.out.println("수신 : " + message); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
}
