package classTutorial;
/**
 * 어노테이션을 적용한 Service 클래스 예제
 * @author jikang
 *
 */
public class ServiceAnnotation {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")							// 기본 엘리먼트 value의 값을 *로 설정
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value = "#", number = 20)		// value의 값을 #으로 설정, number의 값을 20으로 설정
	public void method3() {
		System.out.println("실행 내용3");
	}	
}
