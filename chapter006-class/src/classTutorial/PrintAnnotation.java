package classTutorial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ������̼��� �����ϴ� ����
 * @author jikang
 *
 */
@Target({ElementType.METHOD})			// ������̼��� �޼ҵ忡�� ����ǵ��� ����
@Retention(RetentionPolicy.RUNTIME)		// ������̼� ������ ��Ÿ�� �ñ��� �����ǵ��� ����
public @interface PrintAnnotation {
	String value() default "-";			// �⺻������Ʈ (���м��� ���� ����)
	int number() default 15;			// �ݺ����Ƚ��
}
