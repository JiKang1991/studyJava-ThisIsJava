package inheritance;
/**
 * final method를 재정의 할 수 없음을 확인하는 예제
 * @author jikang
 *
 */
public class FinalMethodSportsCar extends FinalMethodCar{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {	// 컴파일에러 발생
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	

}
