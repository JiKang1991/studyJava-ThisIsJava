package inheritance;
/**
 * 부모 클래스의 생성자를 호출하는 자식 클래스 예제
 * @author jikang
 *
 */
public class CallSuperClassStudent extends CallSuperClassPeople{
	// field
	public int studentNo;
	
	// constructor
	public CallSuperClassStudent(String name, String ssn, int studentNo) {
		super(name, ssn);		// 부모 생성자 호출
		this.studentNo = studentNo;
	}
}
