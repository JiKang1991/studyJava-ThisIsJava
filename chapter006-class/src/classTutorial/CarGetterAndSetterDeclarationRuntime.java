package classTutorial;
/**
 * Getter�� Setter �޼ҵ带 ����ϴ� ����
 * @author jikang
 *
 */
public class CarGetterAndSetterDeclarationRuntime {
	public static void main(String[] args) {
		CarGetterAndSetterDeclaration myCar = new CarGetterAndSetterDeclaration();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}
