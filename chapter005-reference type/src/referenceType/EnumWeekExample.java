package referenceType;

import java.util.Calendar;	// Calendar 클래스를 사용하기 위한 import

/**
 * Calendar을 이용해서 오늘의 요일을 얻고 나서 열거 타입 변수 today에 해당 열거 상수를 대입하는 예제
 * @author jikang
 *
 */
public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;	// 열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 일(1) ~ 토(7)까지의 숫자를 리턴한다.
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;	// 열거 상수 대입
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
