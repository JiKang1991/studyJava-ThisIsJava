package objectClass;
/**
 * hashCode() 메소드 사용 예제 ( hashCode() 메소드 재정의 함 )
 * @author jikang
 *
 */
public class HashCodeOverridingKey {
	public int number;
	
	public HashCodeOverridingKey(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCodeOverridingKey) {
			HashCodeOverridingKey compareKey = (HashCodeOverridingKey) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
	
}