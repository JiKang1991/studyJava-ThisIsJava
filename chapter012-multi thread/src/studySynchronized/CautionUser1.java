package studySynchronized;
/**
 * 공유 객체 사용시 주의점 ( 작업 스레드 )
 * @author jikang
 *
 */
public class CautionUser1 extends Thread{
	/*
	// 공유 객체에 동기화 적용하기 전
	private CautionCalculator calculator;
	
	public void setCalculator(CautionCalculator calculator) {
		// 스레드 이름을 user1로 설정
		this.setName("user1");
		// 공유 객체인 Calculator를 필드에 저장
		this.calculator = calculator;
	}
	*/
	
	// 공유 객체에 동기화 적용
	private CautionCalculatorModifiedVer calculator;
	
	public void setCalculator(CautionCalculatorModifiedVer calculator) {
		// 스레드 이름을 user1로 설정
		this.setName("user1");
		// 공유 객체인 Calculator를 필드에 저장
		this.calculator = calculator;
	}
	
	public void run() {
		// 공유 객체인 Calculator의 메모리에 100을 저장
		calculator.setMemory(100);
	}
}
