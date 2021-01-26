package multipleInterfaceImplementClass;

import declarationOfInterface.RemoteControl;

/**
 * 다중 인터페이스 구현 클래스 예제 (클래스)
 * @author jikang
 *
 */
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	// Searchable의 추상 메소드에 대한 실체 메소드
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	// RemoteControl의 추상 메소드에 대한 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
