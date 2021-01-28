package defaultMethod;
/**
 * 디폴트 메소드 활용 예제(실행 클래스)
 * @author jikang
 *
 */
public class DefaultMethodRuntime {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
