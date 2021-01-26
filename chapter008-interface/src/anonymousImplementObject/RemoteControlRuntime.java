package anonymousImplementObject;

import declarationOfInterface.RemoteControl;

/**
 * 익명 구현 객체 활용 예제
 * @author jikang
 *
 */
public class RemoteControlRuntime {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// 실행문
			}
			
			@Override
			public void turnOff() {
				// 실행문
			}
			
			@Override
			public void setVolume(int vloume) {
				// 실행문				
			}
		};
	}
}
