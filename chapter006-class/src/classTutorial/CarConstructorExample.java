package classTutorial;
/**
 * 명시적 생성자를 호출해서 객체를 생성하는 예제
 * @author jikang
 *
 */
public class CarConstructorExample {
	public static void main(String[] args) {
		CarConstructor myCar = new CarConstructor("검정", 3000);
		//CarConstructor myCar = new CarConstructor();  // 기본 생성자를 호출할 수 없다.
	}
}
