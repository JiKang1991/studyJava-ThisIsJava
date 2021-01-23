package classTutorial;

import java.lang.reflect.Method;


/**
 * ���÷����� �̿��Ͽ� Service Ŭ������ ����� ������̼� ������ �а� ������Ʈ ���� ����
 * ����� ���ڿ� ��� Ƚ���� �ֿܼ� ����� ��, �ش� �޼ҵ带 ȣ���ϴ� ����
 * @author jikang
 *
 */
public class PrintAnnotationRuntime {
	public static void main(String[] args) {
				
		// Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = ServiceAnnotation.class.getDeclaredMethods();
		
		// Method ��ü�� �ϳ��� ó���Ѵ�
		for(Method method : declaredMethods) {
			// PrintAnnotation�� ����Ǿ����� Ȯ���Ѵ�.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// �޼ҵ� �̸��� ���
				System.out.println("[" + method.getName() + "]");
				
				// ���м� ���
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					// �޼ҵ� ȣ��
					method.invoke(new ServiceAnnotation());
				} catch(Exception e) {
					System.out.println();
				}
			}
		}
	}
}
