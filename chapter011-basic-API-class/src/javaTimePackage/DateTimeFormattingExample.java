package javaTimePackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 포맷팅 문자열
 * @author jikang
 *
 */
public class DateTimeFormattingExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = 
			DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
