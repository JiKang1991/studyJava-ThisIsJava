package stringClass;
/**
 * split() 메소드 예제
 * @author jikang
 *
 */
public class SplitExample {
	public static void main(String[] args) {
		String text = "팽수&짱구,슈퍼맨,배트맨-스파이더맨";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
