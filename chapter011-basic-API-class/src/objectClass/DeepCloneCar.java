package objectClass;
/**
 * clone() 메소드 활용 예제( 깊은 복제 선언 되어있는 클래스가 필드값으로 참조하는 객체 )
 * @author jikang
 *
 */
public class DeepCloneCar {
	public String model;
	
	public DeepCloneCar(String model) {
		this.model = model;
	}
}
