package objectClass;
/**
 * equals() �޼ҵ带 �������̵��� Ŭ������ hashCode() �޼ҵ带 �������̵��ϴ� ����
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
		// id�� ������ ���ڿ��� ��� �ش� ���ڿ��� ������ �ִ� �ؽ� �ڵ带 �����ϵ��� �Ѵ�.
		return id.hashCode();
	}

	
	
	
	
	
}
