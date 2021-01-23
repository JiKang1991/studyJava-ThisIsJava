package classTutorial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 어노테이션을 정의하는 예제
 * @author jikang
 *
 */
@Target({ElementType.METHOD})			// 어노테이션이 메소드에만 적용되도록 정의
@Retention(RetentionPolicy.RUNTIME)		// 어노테이션 정보가 런타임 시까지 유지되도록 정의
public @interface PrintAnnotation {
	String value() default "-";			// 기본엘리먼트 (구분선에 사용될 문자)
	int number() default 15;			// 반복출력횟수
}
