package objectClass;

/**
 * clone() 메소드를 활용하는 예제 ( clone()메소드 오버라이딩 없이 얕은 복제를 할 수 있는 클래스 선언 )
 * @author jikang
 *
 */
public class ThinCloneMember implements Cloneable{	// 복제 할 수 있다는 표시
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public ThinCloneMember(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public ThinCloneMember getMember() {
		ThinCloneMember cloned = null;
		try {
			cloned = (ThinCloneMember) clone();	// clone() 메소드의 리턴 타입은 Object이므로 ThinCloneMember 타입으로 캐스팅해야 함
		} catch(CloneNotSupportedException e) {

		}
		return cloned;
	}
}
