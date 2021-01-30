package useOfinterface;

import declarationOfInterface.RemoteControl;

/**
 * �������̽��� �̿��Ͽ� ���� Ŭ������ ����� �����ϴ� ����
 * @author jikang
 *
 */
public class Audio implements RemoteControl{
	// field
	private int volume;
	private boolean mute;
	
	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");	
	}
	
	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	// setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	// �������̽� ����� �̿��ؼ� volume �ʵ��� ���� �����Ѵ�.
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
	
	// override default method
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
	
	
}