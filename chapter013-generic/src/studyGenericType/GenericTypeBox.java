package studyGenericType;
/**
 * 제네릭 타입 클래스 활용 예제
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
