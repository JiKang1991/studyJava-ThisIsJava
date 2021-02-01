package anonymousObjcet.inheritanceInterface;
/**
 * �͸� ���� Ŭ���� ���� �� ��ü ������ ȣ�� ����(���� �� ȣ�� Ŭ����)
 * @author jikang
 *
 */
public class AnonymousRuntime {
	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		annoy.field.turnOn();
		
		// �͸� ��ü ���� ���� ���
		annoy.method1();
		
		// �͸� ��ü �Ű��� ���
		annoy.method2(
			new RemoteControl() {
				
				@Override
				public void turnOn() {
					System.out.println("SmartTV�� �մϴ�.");
				}
				
				@Override
				public void turnOff() {
					System.out.println("SmartTV�� ���ϴ�.");
				}
			}
		);
		
	}
}
