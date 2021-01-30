package nestedInterface;

import nestedInterface.Button.OnClickListener;

/**
 * 중첩 인터페이스 활용 예제 ( 구현 클래스 )
 * @author jikang
 *
 */
public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
	
}
