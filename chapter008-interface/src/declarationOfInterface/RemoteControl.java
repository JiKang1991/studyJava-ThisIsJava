package declarationOfInterface;
/**
 * �������̽��� �������̽��� ����� �����ϴ� ����
 * @author jikang
 *
 */
public interface RemoteControl {
	// constant field
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// abstract method �޼ҵ� ����θ� �ۼ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// default method ���� ������� �ۼ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// static method
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
