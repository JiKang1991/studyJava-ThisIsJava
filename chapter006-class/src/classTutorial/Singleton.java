package classTutorial;
/**
 * Singleton ��ü ���� ����
 * @author jikang
 *
 */
public class Singleton {
	// ���� �ʵ忡 �ڽ��� ��ü�� �����Ѵ�.
	private static Singleton instance = new Singleton();
	
	// �ڽ� ���ο����� ������ �� �ִ� �����ڸ� �����Ѵ�.
	private Singleton() {}
	
	// �ܺη� ��ü�� �����ϴµ� ����ϴ� ���� �޼ҵ带 �����Ѵ�.
	static Singleton getInstance() {
		return instance;
	}
}
