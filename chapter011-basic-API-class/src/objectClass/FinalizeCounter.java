package objectClass;
/**
 * finalize() 메소드 활용 예제 ( finalize() 메소드 재정의(오버라이딩) 클래스 )
 * @author jikang
 *
 */
public class FinalizeCounter {
	public int no;

	public FinalizeCounter(int no) {
		super();
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
	
	
	
}
