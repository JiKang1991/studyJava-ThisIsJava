package studyGenericType;
/**
 * ���׸�Ÿ�� Ŭ���� Ȱ�� ����
 * @author jikang
 *
 */
public class GenericTypeBoxExample {
	public static void main(String[] args) {
		GenericTypeBox<String> box1 = new GenericTypeBox<String>();
		box1.set("hello");
		String str = box1.get();
		
		GenericTypeBox<Integer> box2 = new GenericTypeBox<Integer>();
		box2.set(6);
		int value = box2.get();
	}
}
