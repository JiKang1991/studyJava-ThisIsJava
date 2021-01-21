package classTutorial;
/**
 * 메소드 오버로딩 예제
 * @author jikang
 *
 */
public class CalculatorMethodOverloading {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
