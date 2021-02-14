package formatClass;

import java.text.MessageFormat;

/**
 * MessageFormat Ȱ�� ���� ( �Ű� ����ȭ�� ���ڿ� ���� ) 
 * @author jikang
 *
 */
public class MessageFormatExample {
	public static void main(String[] args) {
		String id = "spring";
		String name = "��";
		String tel = "010-345-3453";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = { "'spring'", "'��'", "'010-345-3453'" };
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}
}
