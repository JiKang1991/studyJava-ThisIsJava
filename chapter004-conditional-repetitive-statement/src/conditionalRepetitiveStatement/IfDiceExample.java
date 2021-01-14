package conditionalRepetitiveStatement;

public class IfDiceExample {
	public static void main(String[] args) {
		/*
		 * (1) Math.random() : 0.0�� 1.0 ���̿� ���ϴ� double Ÿ���� ���� �ϳ��� �����Ѵ�.
		 * 					 : 0.0�� ������ ���Եǰ� 1.0�� ���Ե��� �ʴ´�.
		 *
		 *		0.0 <= Math.random() < 1.0
		 * 
		 * (2) Math.random()�� 10�� ���ϸ� 0.0 ~ 10.0�� ������ ���ϴ� doubleŸ���� ���� ���� �� �ִ�.
		 * 
		 *		0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		 * 		  (0.0)							  (10.0)
		 * 
		 * (3) Math.random() * 10�� int Ÿ������ ���� ��ȯ�ϸ� 0 ~ 9�� ������ ���ϴ� �ϳ��� �������� ���� �� �ִ�.
		 * 
		 * 		(int) 0.0 <= (int)Math.random() * 10 < (int) 10.0
		 * 			(0)		 		( 0 ~ 9 )			  (10)
		 * 
		 * (4) (int)Math.random() * 10�� 1�� ���ϸ� 1 ~ 10�� ������ ���ϴ� �ϳ��� �������� ���� �� �ִ�.
		 * 	
		 * 		0 + 1 <= (int)(Math.randon() * 10) + 1 < 10 + 1
		 * 		 (1)			( 1 ~ 10 )				  (11)
		 * 
		 * (5) ���� ������ �̿��ϸ� start���� �����ϴ� n���� ���� �߿��� ������ ���� �ϳ��� ��� ���� ������� ���� �� �ִ�.
		 *
		 *		int num = (int)(Math.random() * n) + start;
		 *
		 * ex) 1���� �����ϴ� 6���� �����߿��� ������ ���� �ϳ��� ��� ���� �����
		 *		
		 *		int num = (int)(Math.random() * 6) + 1;
		 *
		 * ex) �ζ� ��ȣ �ϳ��� �̱� ���� �����
		 * 	
		 * 		int num = (int)(Math.random() * 45) + 1;
		 */
		
		int num = (int)(Math.random() * 6) + 1;	// �ֻ��� ��ȣ �ϳ� �̱�
		
		if(num == 1) {
			System.out.println("1���� ���Խ��ϴ�.");
		} else if (num == 2) {
			System.out.println("2���� ���Խ��ϴ�.");
		} else if (num == 3) {
			System.out.println("3���� ���Խ��ϴ�.");
		} else if (num == 4) {
			System.out.println("4���� ���Խ��ϴ�.");
		} else if (num == 5) {
			System.out.println("5���� ���Խ��ϴ�.");
		} else {
			System.out.println("6���� ���Խ��ϴ�.");
		}
		
		
	}
}
