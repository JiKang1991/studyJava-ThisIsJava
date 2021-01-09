package variable;
/**
 * byte 변수와 int 변수를 각각 125로 초기화하고 5회에 걸쳐 1씩 더하기한 다음 출력한 결과를 확인하는 예제
 * byte 변수는 127을 넘어서는 순간 최소값인 -128부터 다시 저장되고,
 * int 타입의 변수는 정삭적으로 1씩 증가된 값을 계속 저장한다.
 * @author jikang
 *
 */
public class GarbageVlaueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
