package studyGenericType;
/**
 * ���׸� Ÿ�� Ŭ���� Ȱ�� ����
 * @author jikang
 *
 */
public class GenericTypeBox<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
