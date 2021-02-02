package getExceptionInformation;

import userDefinitionException.Account;
import userDefinitionException.BalanceInsufficientException;

/**
 * 예외의 정보를 얻는 예제
 * @author jikang
 *
 */
public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// deposit
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// withdraw
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();		// 예외 메시지 얻기
			System.out.println(message);
			System.out.println();
			e.printStackTrace();					// 예외 추적 후 출력
		}
		
		
	}
}
