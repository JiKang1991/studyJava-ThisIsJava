package classTutorial;
/**
 * Getter와 Setter 메소드를 사용하는 예제
 * @author jikang
 *
 */
public class CarGetterAndSetterDeclarationRuntime {
	public static void main(String[] args) {
		CarGetterAndSetterDeclaration myCar = new CarGetterAndSetterDeclaration();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
