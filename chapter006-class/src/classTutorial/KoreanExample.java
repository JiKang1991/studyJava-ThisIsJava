package classTutorial;
/**
 * �����ڸ� ���� �ʵ带 �ʱ�ȭ�ϴ� ��ü�� �����Ͽ� �ʵ尪�� ����ϴ� ����
 * @author jikang
 *
 */
public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�", "000-000-0000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "111-111-1111");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
