package studySynchronized;
/**
 * ���� ��ü ���� ������ ( ���� ��ü )
 * @author jikang
 *
 */
public class CautionCalculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// ���� �޸𸮿� ���� �����ϴ� �޼ҵ�
	public void setMemory(int memory) {
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
