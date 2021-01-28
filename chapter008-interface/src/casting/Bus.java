package casting;
/**
 * 캐스팅으로 인터페이스 구현 객체의 메소드를 호출하는 예제(구현 클래스)
 * @author jikang
 *
 */
public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 운행중");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
	
}
