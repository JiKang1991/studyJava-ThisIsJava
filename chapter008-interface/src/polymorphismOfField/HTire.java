package polymorphismOfField;
/**
 * 인터페이스를 사용하여 필드의 다형성을 확인하는 예제(구현 클래스1)
 * @author jikang
 *
 */
public class HTire implements Tire {
	
	// Tire 인터페이스 구현
	@Override
	public void roll() {
		System.out.println("HTire가 굴러갑니다.");
	}
	
}
