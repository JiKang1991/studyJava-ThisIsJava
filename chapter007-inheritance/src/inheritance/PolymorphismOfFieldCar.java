package inheritance;
/**
 * 필드의 다형성 적용 예제
 * @author jikang
 *
 */
public class PolymorphismOfFieldCar {
	// field
	// 4개의 타이어
	PolymorphismOfFieldTire frontLeftTire = new PolymorphismOfFieldTire("앞좌측", 6);
	PolymorphismOfFieldTire frontRightTire = new PolymorphismOfFieldTire("앞우측", 2);
	PolymorphismOfFieldTire backLeftTire = new PolymorphismOfFieldTire("뒤좌측", 3);
	PolymorphismOfFieldTire backRightTire = new PolymorphismOfFieldTire("뒤우측", 4);
	
	// constructor
	
	// method
	// 펑크 났을때 실행하는 메소드
	void stop() {
		System.out.println("[자동차 정지]");
	}
	
	// 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll()메소드를 호출한다.
	// false를 리턴하는 roll이 있을 경우 stop() 메소드를 호출하고 해당 타이어 번호를 리턴한다.
	int run() {
		System.out.println("[자동차 주행중.]");
		if(frontLeftTire.roll() == false) { stop();	return 1; }
		if(frontRightTire.roll() == false) { stop(); return 2; }
		if(backLeftTire.roll() == false) { stop(); return 3; }
		if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
	}
}
