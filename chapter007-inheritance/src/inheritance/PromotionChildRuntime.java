package inheritance;
/**
 * �ڵ� Ÿ�� ��ȯ ���� ��� ������ Ȯ���ϴ� ����(�ڽ� Ŭ���� ���� �� ȣ��) 
 * @author jikang
 *
 */
public class PromotionChildRuntime {
	public static void main(String[] args) {
		PromotionChild child = new PromotionChild();	// �ڽİ�ü ����
		
		PromotionParent parent = child;		// �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();					// �������̵�(������)�� �޼ҵ尡 ȣ��ȴ�.
		// parent.method3();				// �ڽ� Ŭ������ ��ü��, ȣ���� �� ����
	}
}
