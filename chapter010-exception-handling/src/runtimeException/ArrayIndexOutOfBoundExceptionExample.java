package runtimeException;
/**
 * ArrayIndexOutOfBoundException 발생 예제
 * @author jikang
 *
 */
public class ArrayIndexOutOfBoundExceptionExample {
	// 두개의 실행 매개값이 주어져있지 않기 때문에 주석처리 되어있는 메소드는 args[0], args[1]과 같이 인덱스를
	// 사용할 수 없다. (예외 발생)
	/*
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
	}
	*/
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
		
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfVBoundsExceptionExample ");
			System.out.print("값1 값2");
		}
	}
}
