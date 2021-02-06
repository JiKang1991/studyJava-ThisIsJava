package stringClass;

import java.io.IOException;

/**
 * String 생성자 활용 예제 ( 키보드로 입력 받은 바이트 배열을 문자열로 전환 )
 * @author jikang
 *
 */
public class ConstructorKeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		// 읽은 바이트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];		
		
		System.out.print("입력 : ");
		// 배열에 읽은 바이트를 저장하고 일은 바이트 수를 리턴 ( enter의 캐리지리턴(\r), 라인피드(\n) 포함 )
		int readByteNo = System.in.read(bytes);
		
		// 배열을 문자열로 전환
		// ( 0 = 읽은 바이트의 첫 인덱스 부터 ,
		// readByteNo - 2 = 가장 뒤의 캐리지리턴과 라인피드에 해당하는 바이트는 제외하고 그 직전 인덱스까지)
		String str = new String(bytes, 0, readByteNo - 2);
		
		System.out.println(str);
	}
}
