package systemClass;

public class Employee {
	public int eno;

	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ������");
	}
	
	// �Ҹ���
	public void finalize() {
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
	}
	
}
