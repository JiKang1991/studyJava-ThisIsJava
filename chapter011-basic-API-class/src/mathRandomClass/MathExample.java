package mathRandomClass;
/**
 * Math class 활용 예제
 * @author jikang
 *
 */
public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		/*
			0.0과 1.0 사이의 범위에 속하는 하나의 double 타입의 값을 리턴한다.
			0.0은 범위에 포함되고 1.0은 포함되지 않는다.
		*/
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(-5.3);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		/*
			소수 셋째 자릿수에서 반올림하는 코드.
			round() 메소드는 항상 소수점 첫째 자리에서 반올림해서 정수값을 리턴한다.
			원하는 소수 자릿수에서 반올림된 값을 얻기위해서는 반올림할 자릿수가 소수첨 첫째 자리가 되도록
			10^n을 곱한후, round() 메소드의 리턴값을 얻는다.
			다시 10.0^n을 나눠준다.
		*/
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 = " + v16);
	}
}
