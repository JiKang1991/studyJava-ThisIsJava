package conditionalRepetitiveStatement;
/**
 * 주사위 번호 중 하나를 반복적으로 뽑되, 6이 나오면 while문을 break로 종료시키는 예제
 * @author jikang
 *
 */
public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			// Math.random()을 이용하여 1~6의 번호를 무작위로 num변수에 저장한다.
			int num	= (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
