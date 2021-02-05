package systemClass;
/**
 * exit() �޼ҵ� Ȱ�� ����
 * @author jikang
 *
 */
public class ExitExample {
	public static void main(String[] args) {
		// SecurtiyManager setting
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}			
		});
		
		for(int i = 0; i < 10; i++) {
			// i �� ���
			System.out.println(i);
			try {
				System.exit(i);
			} catch (SecurityException e) {
				
			}
		}
	}
}
