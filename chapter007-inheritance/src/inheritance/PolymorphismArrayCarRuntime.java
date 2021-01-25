package inheritance;
/**
 * �������� ���� ��ü�� �迭�� �����ϴ� ����
 * @author jikang
 *
 */
public class PolymorphismArrayCarRuntime {
	public static void main(String[] args) {
		PolymorphismArrayCar car = new PolymorphismArrayCar();
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation -1].location + " HTire�� ��ü");
				car.tires[problemLocation - 1] = 
						new PolymorphismOfFieldHTire(car.tires[problemLocation - 1].location, 15);
			}
			System.out.println("--------------------------------------------------------");
		}
	}
}
