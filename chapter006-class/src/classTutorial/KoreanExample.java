package classTutorial;
/**
 * 생성자를 통해 필드를 초기화하는 객체를 생성하여 필드값을 출력하는 예제
 * @author jikang
 *
 */
public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "000-000-0000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "111-111-1111");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
