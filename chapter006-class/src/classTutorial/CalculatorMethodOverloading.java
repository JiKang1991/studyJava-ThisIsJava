package classTutorial;
/**
 * �޼ҵ� �����ε� ����
 * @author jikang
 *
 */
public class CalculatorMethodOverloading {
	// ���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	// ���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
