package classTutorial;
/**
 * �ܺ� Ŭ�������� Car ��ü�� �ʵ尪�� �а� �����ϴ� ����
 * @author jikang
 *
 */
public class CarExample {
	public static void main(String[] args) {
		// creation of object
		Car myCar = new Car();
		
		// read value of field
		System.out.println("maker : " + myCar.company);
		System.out.println("model : " + myCar.model);
		System.out.println("color : " + myCar.color);
		System.out.println("maxSpeed : " + myCar.maxSpeed);
		System.out.println("speed : " + myCar.speed);
		
		// change value of field
		myCar.speed = 60;
		System.out.println("changedSpeed : " + myCar.speed);
	}
}
