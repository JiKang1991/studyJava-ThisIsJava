package objectClass;

import java.util.Date;

/**
 * toString() 메소드 활용 예제(Object, Date 클래스 toString() 메소드 호출)
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
