package javaTimePackage;

import java.time.LocalDateTime;

/**
 * 날짜와 시간 연산 예제
 * @author jikang
 *
 */
public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시 : " + now);
		
		LocalDateTime targetDateTime = now
			.plusYears(1)
			.minusMonths(2)
			.plusDays(3)
			.plusHours(4)
			.minusMinutes(5)
			.plusSeconds(6);
		System.out.println("연산후 : " + targetDateTime);
	}
}
