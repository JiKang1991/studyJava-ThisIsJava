package classTutorial;
/**
 * return�� ���� ����
 * @author jikang
 *
 */
public class CarReturn {
	// field
	int gas;
	
	// constructor(default constructor)
	
	// method
	// ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// ���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����
	boolean isLeftgas() {
		if(gas==0) {
			System.out.println("gas is not left");
			return false;
		}
		System.out.println("gas is left");
		return true;
	}
	
	// ���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ带 ���� �����Ѵ�.
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("run(remaining gas : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("stop(reamining gas : " + gas + ")");
				return;		// �޼ҵ� ���� ����
			}
		}
	}
}
