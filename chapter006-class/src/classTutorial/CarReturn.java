package classTutorial;
/**
 * return문 선언 예제
 * @author jikang
 *
 */
public class CarReturn {
	// field
	int gas;
	
	// constructor(default constructor)
	
	// method
	// 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftgas() {
		if(gas==0) {
			System.out.println("gas is not left");
			return false;
		}
		System.out.println("gas is left");
		return true;
	}
	
	// 리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드를 강제 종료한다.
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("run(remaining gas : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("stop(reamining gas : " + gas + ")");
				return;		// 메소드 실행 종료
			}
		}
	}
}
