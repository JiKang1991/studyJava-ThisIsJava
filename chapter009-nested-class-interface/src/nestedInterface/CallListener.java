package nestedInterface;

import nestedInterface.Button.OnClickListener;

/**
 * ��ø �������̽� Ȱ�� ���� ( ���� Ŭ���� )
 * @author jikang
 *
 */
public class CallListener implements OnClickListener{

	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
	
}
