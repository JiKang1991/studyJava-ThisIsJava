package classTutorial;
/**
 * final field�� �����ϰ� �ʱ�ȭ�ϴ� ����
 * @author jikang
 *
 */
public class PersonFinalField {
	// field
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// constructor
	public PersonFinalField(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
