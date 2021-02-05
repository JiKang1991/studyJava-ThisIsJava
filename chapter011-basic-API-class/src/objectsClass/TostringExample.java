package objectsClass;

import java.util.Objects;

/**
 * toString() 메소드 활용 예제
 * @author jikang
 *
 */
public class TostringExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}
