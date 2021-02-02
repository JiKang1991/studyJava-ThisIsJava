package objectClass;

import java.util.HashMap;

/**
 * hashCode() 메소드 사용 예제 ( hashCode() 메소드를 오버라이딩하지 않은 클래스를 호출 실행 하는 클래스 )
 * number 필드 값이 같어라도 hashCode() 메소드에서 리턴하는 해시코드가 다르기 때문에 다른 식별키로 인식하므로
 * HashMap의 식별키로 HashCodeKey 객체를 사용하면 저장된 값을 찾아오지 못한다.
 * @author jikang
 *
 */
public class HashCodeKeyExample {
	public static void main(String[] args) {
		// HashCodeKey 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<HashCodeKey, String> hashMap = new HashMap<HashCodeKey, String>();
		
		// 식별키 "new HashCodeKey(1)"로 "홍길동을 저장함.
		hashMap.put(new HashCodeKey(1), "홍길동");
		
		String value = hashMap.get(new HashCodeKey(1));
		System.out.println(value);
	}
}
