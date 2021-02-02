package objectClass;
/**
 * equals() 메소드를 오버라이딩한 클래스에 hashCode() 메소드를 오버라이딩하는 예제
 * @author jikang
 *
 */
public class HashCodeOverridingMember {
	public String id;

	public HashCodeOverridingMember(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCodeOverridingMember) {
			HashCodeOverridingMember member = (HashCodeOverridingMember) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// id가 동일한 문자열일 경우 해당 문자열이 가지고 있는 해시 코드를 리턴하도록 한다.
		return id.hashCode();
	}

	
	
	
	
	
}
