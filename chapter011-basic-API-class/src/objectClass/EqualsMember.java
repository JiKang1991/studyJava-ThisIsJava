package objectClass;
/**
 * equals() �޼ҵ� ��� ����
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
		// �Ű����� EqualsMember Ÿ������ Ȯ��
		if(obj instanceof EqualsMember) {
			// EqualsMember Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id �ʵ� ���� �������� �˻��� ��, �����ϴٸ� true�� ����
			EqualsMember member = (EqualsMember) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		// �Ű����� Member Ÿ���� �ƴϰų� id �ʵ尪�� �ٸ� ��� false�� ����
		return false;
	}
	
	
}
