package objectClass;
/**
 * toString() �޼ҵ� Ȱ�� ���� ( toString() �޼ҵ� �������̵� Ŭ���� ȣ�� ���� Ŭ����)
 * @author jikang
 *
 */
public class ToStringSmartPhoneExample {
	public static void main(String[] args) {
		ToStringSmartPhone myPhone = new ToStringSmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);   // myPhone.toString()�� �ڵ� ȣ���ؼ� ���ϰ��� ���� �� ���
	}
}
