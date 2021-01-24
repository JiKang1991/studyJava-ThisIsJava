package inheritance;
/**
 * ClassInheritanceCellPhone Ŭ������ ��ӹ޴� �ڽ� Ŭ������ �����ϴ� ����
 * @author jikang
 *
 */
public class ClassInheritanceDmbCellPhone extends ClassInheritanceCellPhone {
	// field
	int channel;
	
	// constructor
	ClassInheritanceDmbCellPhone(String model, String color, int channel){
		this.model = model;		// ClassInheritanceCellPhone�κ��� ��ӹ��� �ʵ�
		this.color = color;		// ClassInheritanceCellPhone�κ��� ��ӹ��� �ʵ�
		this.channel = channel;
	}
		
	// method
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
