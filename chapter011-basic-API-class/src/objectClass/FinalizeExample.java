package objectClass;
/**
 * finalize() 메소드 활용 예제 ( finalize() 메소드 재정의 객체 생성 실행)
 * @author jikang
 *
 */
public class FinalizeExample {
	public static void main(String[] args) {
		FinalizeCounter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new FinalizeCounter(i);
			// Counter 객체를 쓰레기로 만듬
			counter = null;
			// garbage collector 실행 요청
			System.gc();
		}
	}
}
