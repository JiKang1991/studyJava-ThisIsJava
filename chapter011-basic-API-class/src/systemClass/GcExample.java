package systemClass;
/**
 * gc() 메소드 활용 예제
 * @author jikang
 *
 */
public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);		// 12째 줄에서 쓰레기가 됨
		emp = null;
		emp = new Employee(2);		// 14째 줄에서 쓰레기가 됨
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원번호 : ");
		System.out.println(emp.eno);
		System.gc();				// Garbage Collector 실행 요청
	}
}
