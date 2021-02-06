package classClass;
/**
 * newInstance() 메소드 활용 예제( newInstance() 메소드로 생성 및 호출할 클래스 )
 * @author jikang
 *
 */
public class NewInstanceSendAction implements NewInstanceAction{

	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
	
}
