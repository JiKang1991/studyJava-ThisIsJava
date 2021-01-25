package inheritance;
/**
 * 추상 클래스 선언 예제(자식 클래스, 실체 클래스)
 * @author jikang
 *
 */
public class AbstractSmartPhone extends AbstractPhone {
	// constructor
	public AbstractSmartPhone(String owner) {
		super(owner);
	}
	
	// method
	public void internetSerch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
