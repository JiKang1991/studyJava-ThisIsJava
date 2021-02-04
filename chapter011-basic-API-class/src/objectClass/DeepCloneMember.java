package objectClass;

import java.util.Arrays;

/**
 * clone() 메소드를 활용하는 예제 ( clone() 메소드를 재정의하여 깊은 복제를 할 수 있는 클래스 선언)
 * @author jikang
 *
 */
public class DeepCloneMember implements Cloneable {
	public String name;
	public int age;
	public int[] scores;		// 참조 타입 필드 (깊은 복제 대상)
	public DeepCloneCar car;	// 참조 타입 필드 (깊은 복제 대상)
	
	public DeepCloneMember(String name, int age, int[] scores, DeepCloneCar car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	// clone() 메소드 오버라이딩
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서(Objcet의 clone() 호출) name, age를 복제한다.
		DeepCloneMember cloned = (DeepCloneMember) super.clone();
		// scores를 깊은 복제 한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제 한다.
		cloned.car = new DeepCloneCar(this.car.model);
		// 깊은 복제된 DeepCloneMember 객체를 리턴한다.
		return cloned;
	}
	
	public DeepCloneMember getMember() {
		DeepCloneMember cloned = null;
		try {
			cloned = (DeepCloneMember) clone();		// 오버라이딩 된 clone() 메소드 호출
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
}
