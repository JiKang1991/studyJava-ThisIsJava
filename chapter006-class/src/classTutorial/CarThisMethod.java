package classTutorial;
/**
 * this �޼ҵ� ������� �ٸ� �����ڸ� ȣ���Ͽ� �ߺ��ڵ带 ���̴� ����
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
