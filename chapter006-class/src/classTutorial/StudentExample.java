package classTutorial;
/**
 * 클래스로부터 객체 생성 예제
 * @author jikang
 *
 */
public class StudentExample {
	public static void main(String[] args) {
		// s1과 s2는 같은 클래스로 만든 객체이지만 각각 다른 객체이므로
		// 다른 주소값을 가지고 독립적으로 작동한다.
		
		// Student 객체를 생성하여 주소값을 리턴한다.
		// 리턴 받은 주소값을 s1 변수에 저장한다.
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		// Student 객체를 생성하여 주소값을 리턴한다.
		// 리턴 받은 주소값을 s2 변수에 저장한다.
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
	}
}
