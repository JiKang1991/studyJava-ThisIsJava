package nestedInterface;
/**
 * 중첩 인터페이스 활용 예제( 실행 클래스 )
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
