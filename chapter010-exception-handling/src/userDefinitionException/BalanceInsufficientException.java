package userDefinitionException;
/**
 * 사용자 정의 예외 선언 예제
 * Exception을 상속하므로 컴파일러에 의해 체크되는 예외가 된다.
 * 소스 작성시 try-catch 블록으로 예외 처리가 필요하다.
 * @author jikang
 *
 */
public class BalanceInsufficientException extends Exception{

	public BalanceInsufficientException() {	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
