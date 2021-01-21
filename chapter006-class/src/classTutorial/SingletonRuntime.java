package classTutorial;
/**
 * 싱글톤 패턴으로 선언한 클래스의 객체를 호출하는 예제
 * @author jikang
 *
 */
public class SingletonRuntime {
	public static void main(String[] args) {
		// Singleton obj1 = new Singleton();	// 컴파일 에러, 생성자에 직접 접근할 수 없다
		
		// getInstance() 메소드를 호출하여 객체를 리턴받는다
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// 동일한 객체인지 비교한다.
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
