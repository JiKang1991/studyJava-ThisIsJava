package inheritance;
/**
 * �ڽ� Ŭ�������� �ʵ�� �޼ҵ带 ����� �θ� Ŭ������ �����ϴ� ����
 * @author jikang
 *
 */
public class ClassInheritanceCellPhone {
	// field
	String model;
	String color;
	
	// constructor
	
	// method
	void powerOn() { System.out.println("������ �մϴ�."); }
	void powerOff() { System.out.println("������ ���ϴ�."); }
	void bell() { System.out.println("���� �︳�ϴ�."); }
	void sendVoice(String message) { System.out.println("�۽� : " + message); }
	void receiveVoice(String message) { System.out.println("���� : " + message); }
	void hangUp() { System.out.println("��ȭ�� �����ϴ�."); }
}
