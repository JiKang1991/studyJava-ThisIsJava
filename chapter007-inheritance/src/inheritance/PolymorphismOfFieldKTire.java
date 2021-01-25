package inheritance;
/**
 * 필드의 다형성 적용 예제(자식 클래스2)
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
			System.out.println(location + " KTire 수명 : " +
			(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KTire 펑크 ***");
			return false;
		}
	}
}
