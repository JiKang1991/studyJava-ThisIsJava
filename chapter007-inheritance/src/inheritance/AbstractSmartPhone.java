package inheritance;
/**
 * �߻� Ŭ���� ���� ����(�ڽ� Ŭ����, ��ü Ŭ����)
 * @author jikang
 *
 */
public class AbstractSmartPhone extends AbstractPhone {
	// constructor
	public AbstractSmartPhone(String owner) {
		super(owner);
	}
	
	// method
	public void internetSerch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
