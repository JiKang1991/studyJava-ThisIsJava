package classTutorial;
/**
 * static block�� �����ϴ� ����
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
