package inheritance;
/**
 * 추상 메소드 선언 및 오버라이딩 예제(자식 클래스, 실체 클래스)
 * @author jikang
 *
 */
public class AbstractMethodAndOverridingCat extends AbstractMethodAndOverridingAnimal{
	public Cat() {
		this.kind = "포유류";
	}

	// 추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	
}
