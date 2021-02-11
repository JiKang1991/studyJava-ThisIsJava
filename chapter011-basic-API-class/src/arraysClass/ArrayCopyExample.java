package arraysClass;

import java.util.Arrays;

/**
 * Array.copyOf(), Array.copyOfRange(), System.arraycopy() Ȱ�� ����
 * @author jikang
 *
 */
public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		// Arrays.copyOf()
		// arr1 ��ü�� arr2�� ����
		char[] arr2 = Arrays.copyOf(arr1,  arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		// Arrays.copyOfRange()
		// arr1[1] ~ arr1[2]�� arr3[0] ~ arr3[1] �� ����
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// System.arraycopy()
		// arr1 ��ü�� arr4�� ����
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}
}
