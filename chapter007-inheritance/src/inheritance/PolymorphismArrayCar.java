package inheritance;
/**
 * 다형성을 적용 객체를 배열로 관리하는 예제
 * @author jikang
 *
 */
public class PolymorphismArrayCar {
	// field
	PolymorphismOfFieldTire[] tires = {
		new PolymorphismOfFieldTire("앞좌측", 6),
		new PolymorphismOfFieldTire("앞우측", 2),
		new PolymorphismOfFieldTire("뒤좌측", 3),
		new PolymorphismOfFieldTire("뒤우측", 4)
	};
	
	// method
	void stop() {
		System.out.println("[자동차 정지]");
	}
	
	int run() {
		System.out.println("[자동차 주행중]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			} 
		}
		return 0;
	}
}
