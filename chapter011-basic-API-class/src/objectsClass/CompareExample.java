package objectsClass;

import java.util.Objects;

/**
 * compare() 메소드 활용 예제 ( 생성 호출 실행 메소드 )
 * @author jikang
 *
 */
public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		/*
		int result = Objects.compare(s1, s2, new CompareNotUsedStudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new CompareNotUsedStudentComparator());
		System.out.println(result);
		*/
		int result = Objects.compare(s1, s2, new CompareStudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new CompareStudentComparator());
		System.out.println(result);
	}
}
