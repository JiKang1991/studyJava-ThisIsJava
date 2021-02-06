package classClass;
/**
 * newInstance() �޼ҵ� Ȱ�� ����( newInstance() �޼ҵ�� Ŭ������ ���� �� ȣ���ϴ� ���� Ŭ���� )
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
