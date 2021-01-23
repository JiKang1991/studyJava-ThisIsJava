package classTutorial;

import java.lang.reflect.Method;


/**
 * 리플렉션을 이용하여 Service 클래스에 적용된 어노테이션 정보를 읽고 엘리먼트 값에 따라
 * 출력할 문자와 출력 횟수를 콘솔에 출력한 후, 해당 메소드를 호출하는 예제
 * @author jikang
 *
 */
public class PrintAnnotationRuntime {
	public static void main(String[] args) {
				
		// Service 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = ServiceAnnotation.class.getDeclaredMethods();
		
		// Method 객체를 하나씩 처리한다
		for(Method method : declaredMethods) {
			// PrintAnnotation이 적용되었는지 확인한다.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름을 출력
				System.out.println("[" + method.getName() + "]");
				
				// 구분선 출력
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					// 메소드 호출
					method.invoke(new ServiceAnnotation());
				} catch(Exception e) {
					System.out.println();
				}
			}
		}
	}
}
