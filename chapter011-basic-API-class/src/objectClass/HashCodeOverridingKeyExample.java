package objectClass;

import java.util.HashMap;

/**
 * hashCode() �޼ҵ� ��� ���� ( hashCode() �޼ҵ带 �������̵��� Ŭ������ ȣ�� ���� �ϴ� Ŭ���� )
 * 
 * @author jikang
 *
 */
public class HashCodeOverridingKeyExample {
	public static void main(String[] args) {
		// HashCodeOverridingKey ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<HashCodeOverridingKey, String> hashMap = new HashMap<HashCodeOverridingKey, String>();
		
		// �ĺ�Ű "new HashCodeOverridingKey(1)"�� "ȫ�浿�� ������.
		hashMap.put(new HashCodeOverridingKey(1), "ȫ�浿");
		
		String value = hashMap.get(new HashCodeOverridingKey(1));
		System.out.println(value);
	}
}
