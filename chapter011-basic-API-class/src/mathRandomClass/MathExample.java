package mathRandomClass;
/**
 * Math class Ȱ�� ����
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
			0.0�� 1.0 ������ ������ ���ϴ� �ϳ��� double Ÿ���� ���� �����Ѵ�.
			0.0�� ������ ���Եǰ� 1.0�� ���Ե��� �ʴ´�.
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
			�Ҽ� ��° �ڸ������� �ݿø��ϴ� �ڵ�.
			round() �޼ҵ�� �׻� �Ҽ��� ù° �ڸ����� �ݿø��ؼ� �������� �����Ѵ�.
			���ϴ� �Ҽ� �ڸ������� �ݿø��� ���� ������ؼ��� �ݿø��� �ڸ����� �Ҽ�÷ ù° �ڸ��� �ǵ���
			10^n�� ������, round() �޼ҵ��� ���ϰ��� ��´�.
			�ٽ� 10.0^n�� �����ش�.
		*/
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 = " + v16);
	}
}
