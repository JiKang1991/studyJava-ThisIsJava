package inheritance;
/**
 * 오버라이딩 된 부모 메소드를 super 키워드 사용하여 호출하는 예제(자식클래스)
 * @author jikang
 *
 */
public class CallSuperMethodFastAirplane extends CallSuperMethodAirplane{
	// 자주 사용되는 고정값들은 상수를 사용함으로써 가독성을 높여준다.
	// 객체들이 공용으로 사용하는 메모리영역이다.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			// CallSuperMethodAirplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
	
	
}
