package inheritance;
/**
 * �������̵� �� �θ� �޼ҵ带 super Ű���� ����Ͽ� ȣ���ϴ� ����(�ڽ�Ŭ����)
 * @author jikang
 *
 */
public class CallSuperMethodFastAirplane extends CallSuperMethodAirplane{
	// ���� ���Ǵ� ���������� ����� ��������ν� �������� �����ش�.
	// ��ü���� �������� ����ϴ� �޸𸮿����̴�.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			// CallSuperMethodAirplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}
	
	
}
