package objectClass;

import java.util.Arrays;

/**
 * clone() �޼ҵ带 Ȱ���ϴ� ���� ( clone() �޼ҵ带 �������Ͽ� ���� ������ �� �� �ִ� Ŭ���� ����)
 * @author jikang
 *
 */
public class DeepCloneMember implements Cloneable {
	public String name;
	public int age;
	public int[] scores;		// ���� Ÿ�� �ʵ� (���� ���� ���)
	public DeepCloneCar car;	// ���� Ÿ�� �ʵ� (���� ���� ���)
	
	public DeepCloneMember(String name, int age, int[] scores, DeepCloneCar car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	// clone() �޼ҵ� �������̵�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ�(Objcet�� clone() ȣ��) name, age�� �����Ѵ�.
		DeepCloneMember cloned = (DeepCloneMember) super.clone();
		// scores�� ���� ���� �Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car�� ���� ���� �Ѵ�.
		cloned.car = new DeepCloneCar(this.car.model);
		// ���� ������ DeepCloneMember ��ü�� �����Ѵ�.
		return cloned;
	}
	
	public DeepCloneMember getMember() {
		DeepCloneMember cloned = null;
		try {
			cloned = (DeepCloneMember) clone();		// �������̵� �� clone() �޼ҵ� ȣ��
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
}
