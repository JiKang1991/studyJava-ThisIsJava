package inheritance;
/**
 * ClassInheritanceCellPhone 클래스를 상속받은
 * ClassInheritanceDmbCellPhone 객체를 호출하는 예제
 * @author jikang
 *
 */
public class ClassInheritanceDmbCellPhoneRuntime {
	public static void main(String[] args) {
		// ClassInheritanceDmbCellPhone 객체 생성
		ClassInheritanceDmbCellPhone dmbCellPhone = new ClassInheritanceDmbCellPhone("이클립스", "화이트", 15);
		
		// ClassInheritanceCellPhone에서 상속받은 field
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		// ClassInheritanceDmbCellPhone의 field
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// ClassInheritanceCellPhone에서 상속받은 method 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("누구세요?");
		dmbCellPhone.receiveVoice("짱구입니다.");
		dmbCellPhone.sendVoice("아! 반갑습니다");
		dmbCellPhone.hangUp();
		
		//ClassInheritanceDmbCellPhone의 method 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
}
}
