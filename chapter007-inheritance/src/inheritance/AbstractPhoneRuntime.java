package inheritance;
/**
 * �߻� Ŭ���� ���� ���� (���� Ŭ����)
 * @author jikang
 *
 */
public class AbstractPhoneRuntime {
	public static void main(String[] args) {
		// AbstractPhone = new AbstractPhone();			// �߻�Ŭ������ new �����ڷ� ��ü ���� �� �� ����
		
		AbstractSmartPhone smartPhone = new AbstractSmartPhone("����");
		
		smartPhone.turnOn();		// �߻�Ŭ���� AbstractPhone�� �޼ҵ�
		smartPhone.internetSerch();
		smartPhone.turnOff();		// �߻�Ŭ���� AbstractPhone�� �޼ҵ�
	}
}
