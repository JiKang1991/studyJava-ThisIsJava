package implementationOfInterface;

import declarationOfInterface.RemoteControl;
/**
 * �������̽��� �̿��Ͽ� ���� Ŭ������ ����� �����ϴ� ����
 * @author jikang
 *
 */
public class Television implements RemoteControl {
	// field
	private int volume;
	
	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");		
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
		System.out.println("���� TV ���� : " + this.volume);
	}	
	
}