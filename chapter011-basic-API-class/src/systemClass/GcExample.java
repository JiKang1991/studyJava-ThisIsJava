package systemClass;
/**
 * gc() �޼ҵ� Ȱ�� ����
 * @author jikang
 *
 */
public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);		// 12° �ٿ��� �����Ⱑ ��
		emp = null;
		emp = new Employee(2);		// 14° �ٿ��� �����Ⱑ ��
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ : ");
		System.out.println(emp.eno);
		System.gc();				// Garbage Collector ���� ��û
	}
}
