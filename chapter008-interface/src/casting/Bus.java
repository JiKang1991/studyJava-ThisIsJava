package casting;
/**
 * ĳ�������� �������̽� ���� ��ü�� �޼ҵ带 ȣ���ϴ� ����(���� Ŭ����)
 * @author jikang
 *
 */
public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("���� ������");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
	
}
