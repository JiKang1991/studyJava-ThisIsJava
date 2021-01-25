package inheritance;
/**
 * �ʵ��� ������ ���� ����(�θ� Ŭ����)
 * @author jikang
 *
 */
public class PolymorphismOfFieldTire {
	// field
	public int maxRotation;				// �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;		// ���� ȸ����
	public String location;				// Ÿ�̾��� ��ġ
	
	// constructor
	public PolymorphismOfFieldTire(String location, int maxRotation) {
		this.location = location;			// �ʵ尪 �ʱ�ȭ
		this.maxRotation = maxRotation;		// �ʵ尪 �ʱ�ȭ
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation;		// ���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			// ���� ȸ�� (���� < �ִ�)�� ��� ����
			System.out.println(location + " Tire ���� : " + 
			(maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			// ��ũ ( ���� > �ִ�)�� ��� ����
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
	}
}
