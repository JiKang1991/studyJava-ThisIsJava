package stringClass;

import java.io.IOException;

/**
 * String ������ Ȱ�� ���� ( Ű����� �Է� ���� ����Ʈ �迭�� ���ڿ��� ��ȯ )
 * @author jikang
 *
 */
public class ConstructorKeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		byte[] bytes = new byte[100];		
		
		System.out.print("�Է� : ");
		// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ���� ( enter�� ĳ��������(\r), �����ǵ�(\n) ���� )
		int readByteNo = System.in.read(bytes);
		
		// �迭�� ���ڿ��� ��ȯ
		// ( 0 = ���� ����Ʈ�� ù �ε��� ���� ,
		// readByteNo - 2 = ���� ���� ĳ�������ϰ� �����ǵ忡 �ش��ϴ� ����Ʈ�� �����ϰ� �� ���� �ε�������)
		String str = new String(bytes, 0, readByteNo - 2);
		
		System.out.println(str);
	}
}
