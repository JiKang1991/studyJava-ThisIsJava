package mathRamdomClass;

import java.util.Arrays;
import java.util.Random;

/**
 * Random 클래스 활용 예제(로또 번호 얻기)
 * @author jikang
 *
 */
public class RandomExample {
	public static void main(String[] args) {
		// 선택번호
		// 선택번호 6개가 저장될 배열을 생성한다
		int[] selectNumber = new int[6];
		
		// 선택번호를 얻기위한 Random 객체를 생성한다
		Random random = new Random(3);
		System.out.print("선택 번호 : ");
		for(int i = 0; i < 6; i++) {
			// 선택번호를 얻어 배열에 저장
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호
		// 당첨번호 6개가 저장될 배열을 생성한다.
		int[] winningNumber = new int[6];
		
		// 당첨번호를 얻기위한 Random 객체를 생성한다.
		random = new Random(5);
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < 6; i++) {
			// 당첨번호를 얻어 배열에 저장한다.
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨여부
		// 비교하기전에 정렬시킴
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		// 배열 항목 값 비교
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨 되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
