package stringClass;
/**
 * equals() 메소드 활용 예제
 * @author jikang
 *
 */
public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("study Java");
		String strVar2 = "study Java";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조합니다.");
		} else {
			System.out.println("다른 String 객체를 참조합니다.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가지고 있습니다.");
		} else {
			System.out.println("다른 문자열을 가지고 있습니다.");
		}
	}
}
