package inheritance;
/**
 * ClassInheritanceCellPhone Ŭ������ ��ӹ���
 * ClassInheritanceDmbCellPhone ��ü�� ȣ���ϴ� ����
 * @author jikang
 *
 */
public class ClassInheritanceDmbCellPhoneRuntime {
	public static void main(String[] args) {
		// ClassInheritanceDmbCellPhone ��ü ����
		ClassInheritanceDmbCellPhone dmbCellPhone = new ClassInheritanceDmbCellPhone("��Ŭ����", "ȭ��Ʈ", 15);
		
		// ClassInheritanceCellPhone���� ��ӹ��� field
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		// ClassInheritanceDmbCellPhone�� field
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// ClassInheritanceCellPhone���� ��ӹ��� method ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receiveVoice("¯���Դϴ�.");
		dmbCellPhone.sendVoice("��! �ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		//ClassInheritanceDmbCellPhone�� method ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
}
}
