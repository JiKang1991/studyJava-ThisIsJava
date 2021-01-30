package nestedInterface;
/**
 * 중첩 인터페이스 활용 예제(중첩 인터페이스 선언 클래스)
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
