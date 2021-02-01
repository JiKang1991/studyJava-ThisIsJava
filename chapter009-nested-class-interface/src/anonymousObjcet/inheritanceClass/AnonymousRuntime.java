package anonymousObjcet.inheritanceClass;
/**
 * �͸� �ڽ� ��ü ���� �� ȣ�� ���� ( ����, ȣ�� Ŭ���� )
 * @author jikang
 *
 */
public class AnonymousRuntime {
	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		// �͸� ��ü �ʵ� ���
		annoy.field.wake();
		
		// �͸� ��ü ���� ���� ���
		annoy.method1();
		
		// �͸� ��ü �Ű��� ���
		annoy.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}

				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			}
		);
	}
}
