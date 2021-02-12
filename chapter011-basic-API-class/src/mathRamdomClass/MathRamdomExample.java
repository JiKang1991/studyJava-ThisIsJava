package mathRamdomClass;
/**
 * Math.random() 메소드 활용 예제( 임의의 주사위의 눈 얻기 )
 * @author jikang
 *
 */
public class MathRamdomExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		System.out.println("주사위의 눈 : " + num);
	}
}
