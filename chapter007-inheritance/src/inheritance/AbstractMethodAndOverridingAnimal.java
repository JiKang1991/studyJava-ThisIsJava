package inheritance;
/**
 * �߻� �޼ҵ� ���� �� �������̵� ����(�θ� Ŭ����, �߻� Ŭ����)
 * @author jikang
 *
 */
public abstract class AbstractMethodAndOverridingAnimal {
	public String kind;
	
	public void eat() {
		System.out.println("���̸� �Խ��ϴ�.");
	}
	
	public abstract void sound();		// �߻� �޼ҵ�
}
