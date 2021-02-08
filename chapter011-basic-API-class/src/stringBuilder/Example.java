package stringBuilder;
/**
 * StringBuilder Ŭ���� Ȱ�� ����
 * @author jikang
 *
 */
public class Example {
	public static void main(String[] args) {
		// StringBuilder ��ü ����
		StringBuilder sb = new StringBuilder();	
		
		// ���ڿ��� ���� �߰�
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());
		
		// index 4 ��ġ �ڿ� 2�� ����
		sb.insert(4, "2");
		
		System.out.println(sb.toString());
		
		// index 4 ��ġ�� ���ڸ� 6���� ���
		sb.setCharAt(4, '6');
		
		System.out.println(sb.toString());
		
		// index 6 ���� index 13 '��'������ "Book"���ڿ��� ��ġ
		sb.replace(6, 13, "Book");
		
		System.out.println(sb.toString());
		
		// index 4���� index 5 '��'���� ����
		sb.delete(4, 5);
		
		System.out.println(sb.toString());
		
		// �� ���ڼ� ���
		int length = sb.length();
		
		System.out.println("�� ���ڼ� : " + length);
		
		// ���ۿ� �ִ� ���� String Ÿ������ ����
		String result = sb.toString();
		
		System.out.println(result);
	}
}
