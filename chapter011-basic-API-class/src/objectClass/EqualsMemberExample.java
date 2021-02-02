package objectClass;
/**
 * equals() 메소드 사용 예제( 호출 및 실행 클래스 )
 * @author jikang
 *
 */
public class EqualsMemberExample {
	public static void main(String[] args) {
		EqualsMember obj1 = new EqualsMember("blue");
		EqualsMember obj2 = new EqualsMember("blue");
		EqualsMember obj3 = new EqualsMember("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다.");
		} else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동일합니다.");
		} else {
			System.out.println("obj1과 obj3은 동일하지 않습니다.");
		}
	}
}
