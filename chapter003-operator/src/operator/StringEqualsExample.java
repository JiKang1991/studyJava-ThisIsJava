package operator;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "Â¯±¸";
		String strVar2 = "Â¯±¸";
		String strVar3 = new String("Â¯±¸");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
