package inheritance;
/**
 * final method ���� ����
 * @author jikang
 *
 */
public class FinalMethodCar {
	// field
	public int speed;
	
	// method
	public void speedUp() { speed += 1; }
	
	// final method
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
