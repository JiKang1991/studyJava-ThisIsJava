package objectClass;
/**
 * toString() �޼ҵ� Ȱ�� ����( toString() �޼ҵ� �������̵� )
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
