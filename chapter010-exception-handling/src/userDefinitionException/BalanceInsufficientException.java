package userDefinitionException;
/**
 * ����� ���� ���� ���� ����
 * Exception�� ����ϹǷ� �����Ϸ��� ���� üũ�Ǵ� ���ܰ� �ȴ�.
 * �ҽ� �ۼ��� try-catch ������� ���� ó���� �ʿ��ϴ�.
 * @author jikang
 *
 */
public class BalanceInsufficientException extends Exception{

	public BalanceInsufficientException() {	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
