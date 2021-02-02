package objectClass;
/**
 * equals() 메소드 사용 예제
 * @author jikang
 *
 */
public class EqualsMember {
	public String id;
	
	public EqualsMember(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// 매개값이 EqualsMember 타입인지 확인
		if(obj instanceof EqualsMember) {
			// EqualsMember 타입으로 강제 타입 변환하고 id 필드 값이 동일한지 검사한 후, 동일하다면 true를 리턴
			EqualsMember member = (EqualsMember) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
		return false;
	}
	
	
}
