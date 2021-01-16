package conditionalRepetitiveStatement;

import java.io.IOException;

/**
 * 키보드에서 1, 2를 입력했을 때 속도를 증속, 감속 시키고
 * 3을 입력하면 프로그램을 종료시키는 예제
 * 
 * (1) while문의 조건식에 사용할 boolean 변수를 초기값 true를 부여하여 선언한다.
 * (2) 무한 루프를 빠져나가기 위해 키보드 3번을 입력하면 while문의 조건식 변수에 false값을 부여할 메소드를 선언한다.
 * 
 * @author jikang
 *
 */
public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// Enter 키가 입력되면 캐리지리턴(13)과 라인피드(10)이 입력되므로 이 값을 제외시킨다.
			if(keyCode != 13 && keyCode != 10) {
				// 메뉴 생성
				System.out.println("-------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-------------------------");
				System.out.print("선택 : ");
			}
			
			// 키보드의 키 코드를 읽는다.
			// 입력받은 번호와 Enter의 번호 13, 10을 차례로 리턴한다.
			// 즉, 입력한 번호가 있다면 Enter를 누를때마다 while문이 3번 반복된다.
			keyCode = System.in.read();
						
			if(keyCode == 49) {	// 키보드의 1이 입력되었을 경우
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(keyCode == 50) { // 키보드의 2가 입력되었을 경우
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(keyCode == 51) { // 키보드의 3이 입력되었을 경우
				run = false;	// while문을 종료하기 위해 run 변수에 false를 저장
			}
		}
		System.out.println("프로그램 종료");
	}
}
