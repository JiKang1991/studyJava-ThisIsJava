package javaTimePackage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 날짜와 시간 비교
 * @author jikang
 *
 */
public class DatetimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("시작일 : " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("종료일 : " + endDateTime);
		//-------------------------------------------
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다." + "\n");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료 합니다." + "\n");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료 했습니다." + "\n");
		}
		//-------------------------------------------
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMiunte = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSeconds = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMiunte = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSeconds = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
				
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 달 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMiunte);
		System.out.println("남은 초 : " + remainSeconds + "\n");
		//-----------------------------------------------
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간 : " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "달 ");
		System.out.print(period.getDays() + "일\n");
		//-----------------------------------------------
		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("남은 초 : " + duration.getSeconds());
	}
}
