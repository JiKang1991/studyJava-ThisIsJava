package inheritance;
/**
 * �߻� Ŭ���� ���� ���� (�θ� Ŭ����, �߻� Ŭ����)
 * @author jikang
 *
 */
public class AbstractPhone {
	// field
	public String owner;
	
	// constructor
	public AbstractPhone(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
