package classTutorial;
/**
 * this 메소드 사용으로 다른 생성자를 호출하여 중복코드를 줄이는 예제
 * @author jikang
 *
 */
public class CarThisMethod {
	// field
	String company = "hundai";
	String model;
	String color;
	int maxSpeed;
	
	// constructor
	CarThisMethod() {
		
	}
	
	CarThisMethod(String model){
		this(model, "silver", 250);
	}
	
	CarThisMethod(String model, String color){
		this(model, color, 250);
	}
	
	CarThisMethod(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
