package objectsClass;

import java.util.Comparator;

/**
 * compare() �޼ҵ� Ȱ�� ���� ( �л� ��ȣ �� �޼ҵ� ���� compare() �޼ҵ� Ȱ������ ���� ������ �޼ҵ� )
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
