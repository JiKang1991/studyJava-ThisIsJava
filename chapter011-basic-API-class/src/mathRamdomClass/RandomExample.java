package mathRamdomClass;

import java.util.Arrays;
import java.util.Random;

/**
 * Random Ŭ���� Ȱ�� ����(�ζ� ��ȣ ���)
 * @author jikang
 *
 */
public class RandomExample {
	public static void main(String[] args) {
		// ���ù�ȣ
		// ���ù�ȣ 6���� ����� �迭�� �����Ѵ�
		int[] selectNumber = new int[6];
		
		// ���ù�ȣ�� ������� Random ��ü�� �����Ѵ�
		Random random = new Random(3);
		System.out.print("���� ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			// ���ù�ȣ�� ��� �迭�� ����
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷��ȣ
		// ��÷��ȣ 6���� ����� �迭�� �����Ѵ�.
		int[] winningNumber = new int[6];
		
		// ��÷��ȣ�� ������� Random ��ü�� �����Ѵ�.
		random = new Random(5);
		System.out.print("��÷ ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			// ��÷��ȣ�� ��� �迭�� �����Ѵ�.
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷����
		// ���ϱ����� ���Ľ�Ŵ
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		// �迭 �׸� �� ��
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷ ���� : ");
		if(result) {
			System.out.println("1� ��÷ �Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}
}
