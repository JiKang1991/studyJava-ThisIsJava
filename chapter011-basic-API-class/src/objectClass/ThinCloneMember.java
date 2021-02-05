package objectClass;

/**
 * clone() �޼ҵ带 Ȱ���ϴ� ���� ( clone()�޼ҵ� �������̵� ���� ���� ������ �� �� �ִ� Ŭ���� ���� )
 * @author jikang
 *
 */
public class ThinCloneMember implements Cloneable{	// ���� �� �� �ִٴ� ǥ��
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
			cloned = (ThinCloneMember) clone();	// clone() �޼ҵ��� ���� Ÿ���� Object�̹Ƿ� ThinCloneMember Ÿ������ ĳ�����ؾ� ��
		} catch(CloneNotSupportedException e) {

		}
		return cloned;
	}
}