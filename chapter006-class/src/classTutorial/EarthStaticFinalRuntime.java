package classTutorial;
/**
 * static final이 선언되어있는 클래스를 사용하는 예제
 * @author jikang
 *
 */
public class EarthStaticFinalRuntime {
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + EarthStaticFinal.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + EarthStaticFinal.EARTH_SURFACE_AREA + "km^2");
	}
}
