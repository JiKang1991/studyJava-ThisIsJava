package inheritance;
/**
 * 필드의 다형성 적용 예제(실행 클래스)
 * @author jikang
 *
 */
public class PolymorphismOfFieldCarRuntime {
	public static void main(String[] args) {
		// PolymorphismOfFieldCar 객체 생성
		PolymorphismOfFieldCar car = new PolymorphismOfFieldCar();		
		
		// PolymorphismOfFieldCar객체의 run() 메소드 5번 실행
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			// 앞좌측 타이어가 펑크 났을 때 HTire로 교체
			case 1:
				System.out.println("앞좌측 HTire로 교체");
				car.frontLeftTire = new PolymorphismOfFieldHTire("앞좌측", 15);
				break;
			// 앞우측 타이어가 펑크 났을 때 KTire로 교체
			case 2:
				System.out.println("앞우측 KTire로 교체");
				car.frontRightTire = new PolymorphismOfFieldKTire("앞우측", 13);
				break;
			// 뒤좌측 타이어가 펑크 났을 때 HTire로 교체
			case 3:
				System.out.println("뒤좌측 HTire로 교체");
				car.backLeftTire = new PolymorphismOfFieldHTire("뒤좌측", 14);
				break;
			// 뒤우측 타이어가 펑크 났을 때 KTire로 교체
			case 4:
				System.out.println("뒤우측 KTire로 교체");
				car.backRightTire = new PolymorphismOfFieldKTire("뒤우측", 17);
				break;
			}
		}
		
	}
}
