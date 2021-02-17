package studySynchronized;
/**
 * 공유 객체 사용시 주의점 ( 공유 객체 )
 * @author jikang
 *
 */
public class CautionCalculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 계산기 메모리에 값을 저장하는 메소드
	public void setMemory(int memory) {
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
