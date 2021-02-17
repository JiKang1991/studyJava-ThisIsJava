package studySynchronized;
/**
 * ���� ��ü ���� ������ ( ���� ��ü ����ȭ ���� ���� )
 * @author jikang
 *
 */
public class CautionCalculatorModifiedVer {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	/*
	// ���� �޸𸮿� ���� �����ϴ� �޼ҵ�, �޼ҵ忡 ����ȭ ����
	public synchronized void setMemory(int memory) {
		// �Ű����� memory �ʵ忡 ����
		this.memory = memory;
		// 2�ʰ� ������ �Ͻ� ����
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	*/
	
	// ���� �޸𸮿� ���� �����ϴ� �޼ҵ�, ����ȭ ������� ����ȭ ����
	public void setMemory(int memory) {
		// ����ȭ ��� ����, �Ű� ������ ��� ���
		synchronized (this) {
			// �Ű����� memory �ʵ忡 ����
			this.memory = memory;
			// 2�ʰ� ������ �Ͻ� ����
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
}