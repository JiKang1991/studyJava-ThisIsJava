package conditionalRepetitiveStatement;
/**
 * ��ø for�� �� �ٱ��� for���� 'A' ~ 'Z'�� �ݺ��ϰ�
 * ���� for���� 'a' ~ 'z'�� �ݺ��ϴµ� lower������ 'g'�� ���ԵǸ�
 * �ٱ��� for�� ���� ���������� ����
 * @author jikang
 *
 */
public class BreakOutterExample {
	public static void main(String[] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}
}
