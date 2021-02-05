package objectsClass;

import java.util.Objects;

/**
 * objects. 메소드 활용 예제
 * @author jikang
 *
 */
public class Student {
	int studentNo;
	String name;

	public Student(int studentNo) {
		this.studentNo = studentNo;
	}

	public Student(int studentNo, String name) {
		this.studentNo = studentNo;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNo, name);
	}
	
	
		
}
