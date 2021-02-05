package objectsClass;

import java.util.Comparator;

/**
 * compare() 메소드 활용 예제 ( 학생 번호 비교 메소드 구현 compare() 메소드 활용하지 않은 상태의 메소드 )
 * @author jikang
 *
 */
public class CompareNotUsedStudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.studentNo < b.studentNo) {
			return -1;
		} else if(a.studentNo == b.studentNo) {
			return 0;
		} else {
			return 1;
		}
	}
}
