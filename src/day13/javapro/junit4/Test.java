package day13.javapro.junit4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author ���ߣ�tony chan
* @version ����ʱ�䣺2019��8��16�� ����5:02:50
* @description ������ģ��JUnitע��
*/

@Target(ElementType.METHOD)	//ֻ���ڷ�����ʹ��
@Retention(RetentionPolicy.RUNTIME) //����ʱ���Է����ȡ���ע��
public @interface Test {

}
