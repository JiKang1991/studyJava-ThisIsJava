package arrayClass;
/**
 * sort() �޼ҵ� Ȱ�� ���� ( Comparable �������̽� ���� Ŭ���� )
 * @author jikang
 *
 */
public class SortMember implements Comparable<SortMember>{
	String name;
	SortMember(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(SortMember o) {
		return name.compareTo(o.name);
	}
	

}
