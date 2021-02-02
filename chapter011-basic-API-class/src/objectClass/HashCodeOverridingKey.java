package objectClass;
/**
 * hashCode() �޼ҵ� ��� ���� ( hashCode() �޼ҵ� ������ �� )
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