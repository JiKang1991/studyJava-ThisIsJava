package studyGenericType;
/**
 * 멀티타입 파라미터 활용 예제
 * @author jikang
 *
 */
public class MultiTypeParameterProduct <T, M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}
