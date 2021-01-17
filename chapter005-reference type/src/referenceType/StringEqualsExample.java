package referenceType;
/**
 * 문자열 변수가 참조하는 문자열 객체의 생성방법에 따른 차이 및
 * 문자열 변수 비교 연산에 관한 예제
 * @author jikang
 *
 */
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "java";
		String strVar2 = "java";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("java");
		String strVar4 = new String("java");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
