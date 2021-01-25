package inheritance;
/**
 * �ʵ��� ������ ���� ����(�ڽ� Ŭ����2)
 * @author jikang
 *
 */
public class PolymorphismOfFieldKTire extends PolymorphismOfFieldTire {

	// field
	
	// constructor
	public PolymorphismOfFieldKTire (String location, int maxRotation) {
		super(location, maxRotation);
	}

	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KTire ���� : " +
			(maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " KTire ��ũ ***");
			return false;
		}
	}
}
