package dateCalendarClass;

import java.util.TimeZone;

/**
 * TimeZone.getTimeZone() 메소드 활용 예제 ( 사용 가능한 시간대 문자열 출력 )
 * @author jikang
 *
 */
public class PrintTimeZone {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
}
