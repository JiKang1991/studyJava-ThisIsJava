package inheritance;
/**
 * �߻� �޼ҵ� ���� �� �������̵� ����(�ڽ� Ŭ����, ��ü Ŭ����)
 * @author jikang
 *
 */
public class AbstractMethodAndOverridingCat extends AbstractMethodAndOverridingAnimal{
	public Cat() {
		this.kind = "������";
	}

	// �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	
	
}
