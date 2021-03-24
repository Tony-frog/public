package day13.javapro.junit4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @author 作者：tony chan
* @version 创建时间：2019年8月16日 下午5:02:50
* @description 描述：模拟JUnit注解
*/

@Target(ElementType.METHOD)	//只能在方法上使用
@Retention(RetentionPolicy.RUNTIME) //运行时可以反射获取这个注解
public @interface Test {

}
