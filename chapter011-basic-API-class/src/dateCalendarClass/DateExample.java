package dateCalendarClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 클래스 활용 예제( 현재 날짜 출력하기 )
 * @author jikang
 *
 */
public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
