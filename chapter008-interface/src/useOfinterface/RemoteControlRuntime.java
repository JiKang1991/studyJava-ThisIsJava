package useOfinterface;

import declarationOfInterface.RemoteControl;
import implementationOfInterface.Audio;
import implementationOfInterface.Television;

/**
 * 인터페이스를 이용하여 구현 클래스를 만들고 구현하는 예제(구현 클래스)
 * @author jikang
 *
 */
public class RemoteControlRuntime {
	public static void main(String[] args) {
		// to declare interface variable
		RemoteControl rc = null;
		
		// to substitute object of Television to interface type
		rc = new Television();
		
		// to call method of interface
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		// to substiture objcet of Audio to interface type
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		// to call static method of interface
		RemoteControl.changeBattery();
	}
}
