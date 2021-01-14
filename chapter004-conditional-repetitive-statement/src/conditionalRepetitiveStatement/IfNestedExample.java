package conditionalRepetitiveStatement;
/**
 * 81 <= ... <= 100 ���̿� ���ϴ� ������ �̾Ƴ���
 * �ٱ� if���� 90���� 80���� �������� ���ǹ��� �ۼ��ϰ�,
 * ��ø if���� ���� ���������� 95���� 85���� �������� ���ǹ��� �ۼ��ؼ�
 * A+, A, B+, B�� ����ϴ� ����
 * 
 * @author jikang
 *
 */
public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("���� : " + score);
		String grade;
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} 
		System.out.println("���� : " + grade);
	}
}
