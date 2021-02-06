package classClass;
/**
 * newInstance() 메소드 활용 예제( newInstance() 메소드로 클래스를 생성 및 호출하는 실행 클래스 )
 * @author jikang
 *
 */
public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("classClass.NewInstanceSendAction");
			 Class clazz = Class.forName("classClass.NewInstanceReceiveAction");
			NewInstanceAction action = (NewInstanceAction) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
