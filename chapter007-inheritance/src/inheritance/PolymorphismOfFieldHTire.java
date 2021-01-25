package inheritance;
/**
 * �ʵ��� ������ ���� ����(�ڽ� Ŭ����1)
 * @author jikang
 *
 */
public class PolymorphismOfFieldHTire extends PolymorphismOfFieldTire {

	// field
	
	// constructor
	public PolymorphismOfFieldHTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HTire ���� : " +
			(maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HTire ��ũ ***");
			return false;
		}
	}	
}
