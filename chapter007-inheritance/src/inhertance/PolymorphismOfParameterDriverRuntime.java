package inhertance;
/**
 * �Ű������� �������� �����ϴ� ����(���� Ŭ����)
 * @author jikang
 *
 */
public class PolymorphismOfParameterDriverRuntime {
	public static void main(String[] args) {
		PolymorphismOfParameterDriver driver = new PolymorphismOfParameterDriver();
		
		PolymorphismOfParameterBus bus = new PolymorphismOfParameterBus();
		PolymorphismOfParameterTaxi taxi = new PolymorphismOfParameterTaxi();
		
		driver.drive(bus);	// �ڵ�Ÿ�Ժ�ȯ
		driver.drive(taxi); // �ڵ�Ÿ�Ժ�ȯ
	}
}
