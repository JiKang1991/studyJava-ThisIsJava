package objectClass;

import java.util.HashMap;

/**
 * hashCode() �޼ҵ� ��� ���� ( hashCode() �޼ҵ带 �������̵����� ���� Ŭ������ ȣ�� ���� �ϴ� Ŭ���� )
 * number �ʵ� ���� ����� hashCode() �޼ҵ忡�� �����ϴ� �ؽ��ڵ尡 �ٸ��� ������ �ٸ� �ĺ�Ű�� �ν��ϹǷ�
 * HashMap�� �ĺ�Ű�� HashCodeKey ��ü�� ����ϸ� ����� ���� ã�ƿ��� ���Ѵ�.
 * @author jikang
 *
 */
public class HashCodeKeyExample {
	public static void main(String[] args) {
		// HashCodeKey ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<HashCodeKey, String> hashMap = new HashMap<HashCodeKey, String>();
		
		// �ĺ�Ű "new HashCodeKey(1)"�� "ȫ�浿�� ������.
		hashMap.put(new HashCodeKey(1), "ȫ�浿");
		
		String value = hashMap.get(new HashCodeKey(1));
		System.out.println(value);
	}
}
