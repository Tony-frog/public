package day13.javapro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 上午10:14:00
* @description 描述：自定义注解
*/



//它在哪用，这个注解在类上使用
//@Target( { ElementType.FIELD, ElementType.TYPE  } )
@Target( { ElementType.TYPE  } )
//声明周期，在运行时也的存在
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
	//设置注解的值，只有成员变量，没有方法
	//private String value = "";
	String value() default "";	//属性
}



