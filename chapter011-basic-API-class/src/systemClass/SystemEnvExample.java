package systemClass;
/**
 * getenv() 메소드 활용 예제
 * @author jikang
 *
 */
public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + javaHome);
	}
}
