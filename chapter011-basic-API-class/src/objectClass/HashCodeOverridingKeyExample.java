package objectClass;

import java.util.HashMap;

/**
 * hashCode() 메소드 사용 예제 ( hashCode() 메소드를 오버라이딩한 클래스를 호출 실행 하는 클래스 )
 * 
 * @author jikang
 *
 */
public class HashCodeOverridingKeyExample {
	public static void main(String[] args) {
		// HashCodeOverridingKey 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<HashCodeOverridingKey, String> hashMap = new HashMap<HashCodeOverridingKey, String>();
		
		// 식별키 "new HashCodeOverridingKey(1)"로 "홍길동을 저장함.
		hashMap.put(new HashCodeOverridingKey(1), "홍길동");
		
		String value = hashMap.get(new HashCodeOverridingKey(1));
		System.out.println(value);
	}
}
