package nestedInterface;
/**
 * ��ø �������̽� Ȱ�� ����( ���� Ŭ���� )
 * @author jikang
 *
 */
public class ButtonRuntime {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
