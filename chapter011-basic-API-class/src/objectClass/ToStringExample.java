package objectClass;

import java.util.Date;

/**
 * toString() �޼ҵ� Ȱ�� ����(Object, Date Ŭ���� toString() �޼ҵ� ȣ��)
 * @author jikang
 *
 */
public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
