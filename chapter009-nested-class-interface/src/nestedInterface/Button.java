package nestedInterface;
/**
 * ��ø �������̽� Ȱ�� ����(��ø �������̽� ���� Ŭ����)
 * @author jikang
 *
 */
public class Button {
	// nested interface
	interface OnClickListener {
		void onClick();
	}
	
	// field
	OnClickListener listener;
	
	// method
	// polymorphism of parameter
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// call onClick method of implements class
	void touch() {
		listener.onClick();
	}
}
