package classTutorial;
/**
 * �̱��� �������� ������ Ŭ������ ��ü�� ȣ���ϴ� ����
 * @author jikang
 *
 */
public class SingletonRuntime {
	public static void main(String[] args) {
		// Singleton obj1 = new Singleton();	// ������ ����, �����ڿ� ���� ������ �� ����
		
		// getInstance() �޼ҵ带 ȣ���Ͽ� ��ü�� ���Ϲ޴´�
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// ������ ��ü���� ���Ѵ�.
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}
