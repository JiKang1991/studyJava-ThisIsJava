package studySynchronized;
/**
 * 공유 객체 사용시 주의점(메인 스레드가 실행하는 코드)
 * @author jikang
 *
 */
public class MainThreadExample {
	public static void main(String[] args) {
		
		// 공유 객체에 동기화 설정 전
		//CautionCalculator calculator = new CautionCalculator();
		
		// 공유 객체에 동기화 설정
		CautionCalculatorModifiedVer calculator = new CautionCalculatorModifiedVer();
		
		// CautionUser1 스레드 생성
		CautionUser1 user1 = new CautionUser1();
		// 공유 객체 설정
		user1.setCalculator(calculator);
		// user1 스레드 시작
		user1.start();
		
		// CautionUser2 스레드 생성
		CautionUser2 user2 = new CautionUser2();
		// 공유 객체 설정
		user2.setCalculator(calculator);
		// user2 스레드 시작
		user2.start();
				
	}
}
