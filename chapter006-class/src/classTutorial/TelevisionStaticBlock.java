package classTutorial;
/**
 * static block를 선언하는 예제
 * @author jikang
 *
 */
public class TelevisionStaticBlock {
	// static field
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	// static block
	static {
		info = company + " - " + model;
	}
	
}
