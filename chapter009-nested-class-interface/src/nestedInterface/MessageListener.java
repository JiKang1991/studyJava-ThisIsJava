package nestedInterface;

import nestedInterface.Button.OnClickListener;

/**
 * ��ø �������̽� Ȱ�� ���� ( ���� Ŭ���� )
 * @author jikang
 *
 */
public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("�޽����� �����ϴ�.");
	}
	
}
