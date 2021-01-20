package classTutorial;
/**
 * 생성자를 오버로딩 하는 예제
 * @author jikang
 *
 */
public class CarOverloading {
	// field
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	
	// constructor
	// No1. 
	CarOverloading() {
		
	}
	
	// No2.
	CarOverloading(String model){
		this.model = model;
	}
	
	// No3.
	CarOverloading(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// No4.
	CarOverloading(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
