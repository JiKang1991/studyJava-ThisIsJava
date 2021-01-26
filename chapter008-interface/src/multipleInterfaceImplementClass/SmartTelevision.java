package multipleInterfaceImplementClass;

import declarationOfInterface.RemoteControl;

/**
 * ���� �������̽� ���� Ŭ���� ���� (Ŭ����)
 * @author jikang
 *
 */
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	// Searchable�� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	// RemoteControl�� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("���� TV ���� : " + this.volume);
	}

}
