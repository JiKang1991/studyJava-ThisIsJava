package objectClass;
/**
 * toString() 메소드 활용 예제( toString() 메소드 오버라이딩 )
 * @author jikang
 *
 */
public class ToStringSmartPhone {
	private String company;
	private String os;
	
	public ToStringSmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "ToStringSmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
}
