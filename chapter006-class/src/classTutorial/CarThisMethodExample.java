package classTutorial;
/**
 * this() 메소드를 사용하여 중복 코드를 줄인 클래스를 생성자로 호출하는 예제
 * @author jikang
 *
 */
public class CarThisMethodExample {
	public static void main(String[] args) {
		CarThisMethod car1 = new CarThisMethod();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		CarThisMethod car2 = new CarThisMethod("morning");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		CarThisMethod car3 = new CarThisMethod("morning", "red");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		CarThisMethod car4 = new CarThisMethod("sonata", "black", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
