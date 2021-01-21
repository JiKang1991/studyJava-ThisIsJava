package classTutorial;
/**
 * final field를 선언하고 초기화하는 예제
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
