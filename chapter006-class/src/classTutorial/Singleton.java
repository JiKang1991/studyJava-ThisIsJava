package classTutorial;
/**
 * Singleton 객체 선언 예제
 * @author jikang
 *
 */
public class Singleton {
	// 정적 필드에 자신의 객체를 저장한다.
	private static Singleton instance = new Singleton();
	
	// 자신 내부에서만 접근할 수 있는 생성자를 선언한다.
	private Singleton() {}
	
	// 외부로 객체를 전달하는데 사용하는 정적 메소드를 선언한다.
	static Singleton getInstance() {
		return instance;
	}
}
