package studyGenericType;
/**
 * ��ƼŸ�� �Ķ���� Ȱ�� ����
 * @author jikang
 *
 */
public class MultiTypeParameterProductExample {
	public static void main(String[] args) {
		MultiTypeParameterProduct<MultiTypeParameterTv, String> product1 = new MultiTypeParameterProduct<>();
		product1.setKind(new MultiTypeParameterTv());
		product1.setModel("����ƮTV");
		MultiTypeParameterTv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		MultiTypeParameterProduct<MultiTypeParameterCar, String> product2 = new MultiTypeParameterProduct<>();
		product2.setKind(new MultiTypeParameterCar());
		product2.setModel("����");
		MultiTypeParameterCar car = product2.getKind();
		String carModel = product2.getModel();
		
	}
}
