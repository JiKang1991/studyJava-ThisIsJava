package dateCalendarClass;

import java.util.TimeZone;

/**
 * TimeZone.getTimeZone() �޼ҵ� Ȱ�� ���� ( ��� ������ �ð��� ���ڿ� ��� )
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
