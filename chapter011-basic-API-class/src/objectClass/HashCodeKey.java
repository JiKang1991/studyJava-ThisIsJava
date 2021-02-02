package objectClass;
/**
 * hashCode() �޼ҵ� ��� ���� ( hashCode() �޼ҵ� ������ ���� ���� )
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
