package referenceType;
/**
 * ���α׷��� ������ �� 2���� ���ڿ��� ���� ������ ���α׷��� ������ ����ϰ�
 * ���� �����ϵ��� �ϴ� ����
 * ���α׷��� ������ �� 2���� ���ڿ��� ��Ȯ�� �ԷµǾ��ٸ� 2���� ���ڿ��� int Ÿ�� ���ڷ� ��ȯ�ϰ�
 * ���� ������ �����Ѵ�.
 * 
 * �� ������ f11�� ���� �׳� �����ϸ� if�� �� ���� ���๮�� ����ǰ� ���α׷��� ����ȴ�.
 * �����Ҷ� �Ű����� ���� �ʾұ� ������ ���� 0�� String �迭�� �Ű������� ���޵ȴ�
 * ���� args.length�� 0�̹Ƿ� if ���ǽ��� true�� �Ǿ� if���� ����� ����� ���̴�.
 * 
 * ��Ŭ�������� ���α׷��� ������ �� �Ű����� �ְ� �����ϴ� ���
 *
 * [Menu -> Run -> Run Configurations -> Main -> Project -> Main Class
 * -> Arguments -> Program arguments] '���ڿ�0 ���ڿ�1 ... ���ڿ�n-1'�� �Է��ϰ� [Run]�� Ŭ���Ѵ�.
 * 
 * �̴� ��� ������Ʈ���� 'java MainStringArrayArgument ���ڿ�0 ���ڿ�1 ... ���ڿ�n-1'�� �����ϴ� �Ͱ� �����ϴ�.
 *
 * �̷��� �����ϸ� args�� { ���ڿ�0, ���ڿ�1, ... , ���ڿ�n-1 } �迭�� �����ϰ� �ǰ�
 * args[0]�� ���ڿ�0, args[1]�� ���ڿ�1, args[n-1]�� ���ڿ�n-1�� ���� �� �ִ�.
 *
 * @author jikang
 *
 */
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) { // �Էµ� ������ ������ �� ���� �ƴҰ��
			System.out.println("���α׷��� ����");
			System.out.println("java mainStringArrayArgument num1 num2");
			System.exit(0);	// ���α׷� ���� ����
		}
		
		String strNum1 = args[0];	// ù��° ������ ���
		String strNum2 = args[1];	// �ι�° ������ ���
		
		// ���ڿ��� ������ ��ȯ
		// ������ ��ȯ�� �� ���� ���ڿ��� �־����� ��쿡�� NumberformetException ���� ���ܰ� �߻��Ѵ�.
		int num1 = Integer.parseInt(strNum1);	
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
