package autoCloseableResource;
/**
 * �ڵ� ���ҽ� �ݱ�(ȣ�� �� ���� Ŭ����)
 * @author jikang
 *
 */
public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();		// ���������� ���� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}
