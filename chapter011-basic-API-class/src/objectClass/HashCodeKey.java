package objectClass;
/**
 * hashCode() 메소드 사용 예제 ( hashCode() 메소드 재정의 하지 않음 )
 * @author jikang
 *
 */
public class HashCodeKey {
	public int number;
	
	public HashCodeKey(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCodeKey) {
			HashCodeKey compareKey = (HashCodeKey) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	
}
