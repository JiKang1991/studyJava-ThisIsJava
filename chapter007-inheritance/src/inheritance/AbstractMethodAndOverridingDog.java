package inheritance;
/**
 * �߻� �޼ҵ� ���� �� �������̵� ����(�ڽ� Ŭ����, ��ü Ŭ����)
 * @author jikang
 *
 */
public class AbstractMethodAndOverridingDog extends AbstractMethodAndOverridingAnimal{	
	public AbstractMethodAndOverridingDog() {
		this.kind = "������";
	}
	
	// �߻� �޼ҵ� ������
	@Override			
	public void sound() {
		System.out.println("�۸�");		
	}
	
}
