package polymorphismOfParameter;
/**
 * 인터페이스를 사용한 매개변수 다형성 확인 예제(구현 클래스)
 * @author jikang
 *
 */
public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 운행중");
	}
	
}
