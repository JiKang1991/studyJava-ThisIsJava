package conditionalRepetitiveStatement;

public class IfDiceExample {
	public static void main(String[] args) {
		/*
		 * (1) Math.random() : 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴한다.
		 * 					 : 0.0은 범위에 포함되고 1.0은 포함되지 않는다.
		 *
		 *		0.0 <= Math.random() < 1.0
		 * 
		 * (2) Math.random()에 10을 곱하면 0.0 ~ 10.0의 범위에 속하는 double타입의 값을 얻을 수 있다.
		 * 
		 *		0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		 * 		  (0.0)							  (10.0)
		 * 
		 * (3) Math.random() * 10을 int 타입으로 강제 변환하면 0 ~ 9의 범위에 속하는 하나의 정수값을 얻을 수 있다.
		 * 
		 * 		(int) 0.0 <= (int)Math.random() * 10 < (int) 10.0
		 * 			(0)		 		( 0 ~ 9 )			  (10)
		 * 
		 * (4) (int)Math.random() * 10에 1을 더하면 1 ~ 10의 범위에 속하는 하나의 정수값을 얻을 수 있다.
		 * 	
		 * 		0 + 1 <= (int)(Math.randon() * 10) + 1 < 10 + 1
		 * 		 (1)			( 1 ~ 10 )				  (11)
		 * 
		 * (5) 위의 원리를 이용하면 start부터 시작하는 n개의 정수 중에서 임의의 정수 하나를 얻기 위한 연산식을 만들 수 있다.
		 *
		 *		int num = (int)(Math.random() * n) + start;
		 *
		 * ex) 1부터 시작하는 6개의 정수중에서 임의의 정수 하나를 얻기 위한 연산식
		 *		
		 *		int num = (int)(Math.random() * 6) + 1;
		 *
		 * ex) 로또 번호 하나를 뽑기 위한 연산식
		 * 	
		 * 		int num = (int)(Math.random() * 45) + 1;
		 */
		
		int num = (int)(Math.random() * 6) + 1;	// 주사위 번호 하나 뽑기
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		
	}
}
