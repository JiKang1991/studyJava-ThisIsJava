package objectClass;
/**
 * toString() 메소드 활용 예제 ( toString() 메소드 오버라이딩 클래스 호출 실행 클래스)
 * @author jikang
 *
 */
public class ToStringSmartPhoneExample {
	public static void main(String[] args) {
		ToStringSmartPhone myPhone = new ToStringSmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);   // myPhone.toString()을 자동 호출해서 리턴값을 얻은 후 출력
	}
}
