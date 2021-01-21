package classTutorial;
/**
 * final field를 선언한 객체를 호출하는 예제
 * @author jikang
 *
 */
public class PersonFinalFieldRuntime {
	public static void main(String[] args) {
		PersonFinalField p1 = new PersonFinalField("123-123-123", "이클립스");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";		// 수정불가
		//p1.ssm = "321-321-321";	// 수정불가
		p1.name = "자바";
		
	}
}
