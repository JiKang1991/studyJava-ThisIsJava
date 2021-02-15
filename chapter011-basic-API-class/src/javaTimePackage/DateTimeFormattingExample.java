package javaTimePackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ������ ���ڿ�
 * @author jikang
 *
 */
public class DateTimeFormattingExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = 
			DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
