package arrayClass;
/**
 * sort() 메소드 활용 예제 ( Comparable 인터페이스 구현 클래스 )
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
