package inheritance;
/**
 * 필드의 다형성 적용 예제(부모 클래스)
 * @author jikang
 *
 */
public class PolymorphismOfFieldTire {
	// field
	public int maxRotation;				// 최대 회전수(타이어 수명)
	public int accumulatedRotation;		// 누적 회전수
	public String location;				// 타이어의 위치
	
	// constructor
	public PolymorphismOfFieldTire(String location, int maxRotation) {
		this.location = location;			// 필드값 초기화
		this.maxRotation = maxRotation;		// 필드값 초기화
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation;		// 누적 회전수 1증가
		if(accumulatedRotation < maxRotation) {
			// 정상 회전 (누적 < 최대)일 경우 실행
			System.out.println(location + " Tire 수명 : " + 
			(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			// 펑크 ( 누적 > 최대)일 경우 실행
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
