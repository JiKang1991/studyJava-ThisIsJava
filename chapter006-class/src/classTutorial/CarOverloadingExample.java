package classTutorial;
/**
 * 오버로딩한 생성자들을 사용하여 객체를 생성하는 예제
 * @author jikang
 *
 */
public class CarOverloadingExample {
	public static void main(String[] args) {
		CarOverloading car1 = new CarOverloading();			// No1. constructor
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		CarOverloading car2 = new CarOverloading("sonata");	// No2. constructor
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		CarOverloading car3 = new CarOverloading("sonata", "red");	//No3. constructor
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		CarOverloading car4 = new CarOverloading("granduar", "black", 200);	// No4. constructor
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
