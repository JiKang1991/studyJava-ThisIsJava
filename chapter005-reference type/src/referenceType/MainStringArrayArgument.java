package referenceType;
/**
 * 프로그램을 실행할 때 2개의 문자열을 주지 않으면 프로그램의 사용법을 출력하고
 * 강제 종로하도록 하는 예제
 * 프로그램을 실행할 때 2개의 문자열이 정확히 입력되었다면 2개의 문자열을 int 타입 숫자로 변환하고
 * 덧셈 연산을 수행한다.
 * 
 * 이 예제를 f11을 눌러 그냥 실행하면 if문 블럭 안의 실행문이 실행되고 프로그램이 종료된다.
 * 실행할때 매개값을 주지 않았기 때문에 길이 0인 String 배열이 매개값으로 전달된다
 * 따라서 args.length는 0이므로 if 조건식이 true가 되어 if문의 블록이 실행된 것이다.
 * 
 * 이클립스에서 프로그램을 실행할 때 매개값을 주고 실행하는 방법
 *
 * [Menu -> Run -> Run Configurations -> Main -> Project -> Main Class
 * -> Arguments -> Program arguments] '문자열0 문자열1 ... 문자열n-1'을 입력하고 [Run]을 클릭한다.
 * 
 * 이는 명령 프롬프트에서 'java MainStringArrayArgument 문자열0 문자열1 ... 문자열n-1'로 실행하는 것과 동일하다.
 *
 * 이렇게 실행하면 args는 { 문자열0, 문자열1, ... , 문자열n-1 } 배열을 참조하게 되고
 * args[0]은 문자열0, args[1]은 문자열1, args[n-1]은 문자열n-1을 얻을 수 있다.
 *
 * @author jikang
 *
 */
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) { // 입력된 데이터 개수가 두 개가 아닐경우
			System.out.println("프로그램의 사용법");
			System.out.println("java mainStringArrayArgument num1 num2");
			System.exit(0);	// 프로그램 강제 종료
		}
		
		String strNum1 = args[0];	// 첫번째 데이터 얻기
		String strNum2 = args[1];	// 두번째 데이터 얻기
		
		// 문자열을 정수로 변환
		// 정수로 변환할 수 없는 문자열이 주어졌을 경우에는 NumberformetException 실행 예외가 발생한다.
		int num1 = Integer.parseInt(strNum1);	
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
