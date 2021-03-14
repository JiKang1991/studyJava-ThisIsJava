package studyGenericType;
/**
 * 멀티타입 파라미터 활용 예제
 * @author jikang
 *
 */
public class MultiTypeParameterProductExample {
	public static void main(String[] args) {
		MultiTypeParameterProduct<MultiTypeParameterTv, String> product1 = new MultiTypeParameterProduct<>();
		product1.setKind(new MultiTypeParameterTv());
		product1.setModel("스마트TV");
		MultiTypeParameterTv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		MultiTypeParameterProduct<MultiTypeParameterCar, String> product2 = new MultiTypeParameterProduct<>();
		product2.setKind(new MultiTypeParameterCar());
		product2.setModel("디젤");
		MultiTypeParameterCar car = product2.getKind();
		String carModel = product2.getModel();
		
	}
}
