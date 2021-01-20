package classTutorial;
/**
 * 필드 초기값 출력 예제
 * @author jikang
 *
 */
public class FieldInitValueExample {
	public static void main(String[] args) {
		// creation of object
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		System.out.println("arrayField : " + fiv.arrayField);
		System.out.println(("referenceField : " + fiv.referenceField));
		
	}
}
