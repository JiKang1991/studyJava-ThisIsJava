package codeOfHandlingException;
/**
 * 일반 예외 처리 예제
 * @author jikang
 *
 */
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}		
	}
}
