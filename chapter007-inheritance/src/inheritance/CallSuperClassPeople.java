package inheritance;
/**
 * 자식 클래스에서 부모 생성자를 호출하기 위한 예제
 * @author jikang
 *
 */
public class CallSuperClassPeople {
	// field
	public String name;
	public String ssn;
	
	// constructor
	public CallSuperClassPeople(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
