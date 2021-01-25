package inheritance;
/**
 * �߻� �޼ҵ� ���� �� �������̵� ���� (���� Ŭ����)
 * @author jikang
 *
 */
public class AbstractMethodAndOverridingAnimalRuntime {
	// �޼ҵ��� ������ ����
	public static void animalSound(AbstractMethodAndOverridingAnimal animal) {	// �ڵ� Ÿ�� ��ȯ
		animal.sound();			// �����ǵ� �޼ҵ� ȣ��
	}
	
	public static void main(String[] args) {
		AbstractMethodAndOverridingDog dog = new AbstractMethodAndOverridingDog();
		AbstractMethodAndOverridingCat cat = new AbstractMethodAndOverridingCat();
		dog.sound();
		cat.sound();
		System.out.println("-----------------");
		
		// ������ �ڵ� Ÿ�� ��ȯ
		AbstractMethodAndOverridingAnimal animal = null;
		animal = new AbstractMethodAndOverridingDog();			// �ڵ� Ÿ�� ��ȯ
		animal.sound(); 										// �����ǵ� �޼ҵ� ȣ��
		animal = new AbstractMethodAndOverridingCat();			// �ڵ� Ÿ�� ��ȯ
		animal.sound();											// �����ǵ� �޼ҵ� ȣ��
		System.out.println("-----------------");
		
		// �޼ҵ��� ������
		animalSound(new AbstractMethodAndOverridingDog());		// �ڵ� Ÿ�� ��ȯ
		animalSound(new AbstractMethodAndOverridingCat());		// �ڵ� Ÿ�� ��ȯ
	}
}
