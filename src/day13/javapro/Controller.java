package day13.javapro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����10:14:00
* @description �������Զ���ע��
*/



//�������ã����ע��������ʹ��
//@Target( { ElementType.FIELD, ElementType.TYPE  } )
@Target( { ElementType.TYPE  } )
//�������ڣ�������ʱҲ�Ĵ���
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
	//����ע���ֵ��ֻ�г�Ա������û�з���
	//private String value = "";
	String value() default "";	//����
}



