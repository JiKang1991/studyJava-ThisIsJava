package wrapperClass;
/**
 * auto boxing and auto unboxing ¿¹Á¦ 
 * @author jikang
 *
 */
public class AutoBoxingUnboxingExample {
	public static void main(String[] args) {
		// auto boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// auto unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// auto unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
