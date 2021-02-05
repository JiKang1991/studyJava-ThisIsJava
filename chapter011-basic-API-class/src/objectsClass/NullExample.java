package objectsClass;

import java.util.Objects;

/**
 * isNull() nonNull() requireNonNull() 메소드 활용 예제
 * @author jikang
 *
 */
public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
