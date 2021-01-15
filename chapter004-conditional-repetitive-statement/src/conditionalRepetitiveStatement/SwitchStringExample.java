package conditionalRepetitiveStatement;
/**
 * String 변수를 switch문에 적용하는 예제
 * @author jikang
 *
 */
public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		}
	}
}
