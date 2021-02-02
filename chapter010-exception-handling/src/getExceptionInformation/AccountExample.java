package getExceptionInformation;

import userDefinitionException.Account;
import userDefinitionException.BalanceInsufficientException;

/**
 * ������ ������ ��� ����
 * @author jikang
 *
 */
public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// deposit
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		// withdraw
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();		// ���� �޽��� ���
			System.out.println(message);
			System.out.println();
			e.printStackTrace();					// ���� ���� �� ���
		}
		
		
	}
}
