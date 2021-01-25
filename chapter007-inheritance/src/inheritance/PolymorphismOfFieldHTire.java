package inheritance;
/**
 * 필드의 다형성 적용 예제(자식 클래스1)
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
			System.out.println(location + " HTire 수명 : " +
			(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HTire 펑크 ***");
			return false;
		}
	}	
}
