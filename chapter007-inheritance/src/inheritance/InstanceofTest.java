package inheritance;
/**
 * instancof 연산자 활용 예제(parent 객체를 사용하는 클래스)
 * @author jikang
 *
 */
public class InstanceofTest {
	public static void method1(InstanceofParent parent) {
		if (parent instanceof InstanceofChild) {
			InstanceofChild child = (InstanceofChild)parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	
	public static void method2(InstanceofParent parent) {
		InstanceofChild child = (InstanceofChild)parent;		// ClassCastException이 발생할 가능성		
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		InstanceofParent parentA = new InstanceofChild();
		// InstanceofChild 객체를 매개값으로 전달
		method1(parentA);
		method2(parentA);
		
		InstanceofParent parentB = new InstanceofParent();
		// InstanceofParent 객체를 매개값으로 전달
		method1(parentB);
		method2(parentB);
	}
}
