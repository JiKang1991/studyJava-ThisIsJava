package inheritance;
/**
 * 추상 메소드 선언 및 오버라이딩 예제(부모 클래스, 추상 클래스)
 * @author jikang
 *
 */
public abstract class AbstractMethodAndOverridingAnimal {
	public String kind;
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
	
	public abstract void sound();		// 추상 메소드
}
