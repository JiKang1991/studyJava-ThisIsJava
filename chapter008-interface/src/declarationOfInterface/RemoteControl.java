package declarationOfInterface;
/**
 * 인터페이스와 인터페이스의 멤버를 선언하는 예제
 * @author jikang
 *
 */
public interface RemoteControl {
	// constant field
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method 메소드 선언부만 작성
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// default method 실행 내용까지 작성
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
