package inheritance;
/**
 * 부모 클래스의 생성자를 호출하는 자식 클래스를 이용하는 예제
 * @author jikang
 *
 */
public class CallSuperClassStudentRuntime {
	public static void main(String[] args) {
		CallSuperClassStudent student = new CallSuperClassStudent("둘리", "123123-456456", 1);
		System.out.println("name : " + student.name);		// 부모 객체에서 물려받은 필드 출력
		System.out.println("ssn : " + student.ssn);			// 부모 객체에서 물려받은 필드 출력
		System.out.println("studentNo : " + student.studentNo );		
	}
}
