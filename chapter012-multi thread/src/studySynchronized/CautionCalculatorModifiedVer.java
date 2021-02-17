package studySynchronized;
/**
 * 공유 객체 사용시 주의점 ( 공유 객체 동기화 적용 버전 )
 * @author jikang
 *
 */
public class CautionCalculatorModifiedVer {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	/*
	// 계산기 메모리에 값을 저장하는 메소드, 메소드에 동기화 적용
	public synchronized void setMemory(int memory) {
		// 매개값을 memory 필드에 저장
		this.memory = memory;
		// 2초간 스레드 일시 정지
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	*/
	
	// 계산기 메모리에 값을 저장하는 메소드, 동기화 블록으로 동기화 적용
	public void setMemory(int memory) {
		// 동기화 블록 설정, 매개 변수는 잠금 대상
		synchronized (this) {
			// 매개값을 memory 필드에 저장
			this.memory = memory;
			// 2초간 스레드 일시 정지
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
}