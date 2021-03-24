package day13.javapro.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
* @author 作者：tony chan
* @version 创建时间：下午5:41:35
* @description 描述：
*/
public class TestPrivate {
	@Test
	public void privateField() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.HelloPrivate");
		Object obj = clazz.newInstance();
		
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		
		String name = (String)f.get(obj);
		System.out.println(name);
		
		f.set(obj, "改变了吧，小样");
		System.out.println(f.get(obj));
		
	}
	
	@Test
	public void privateMethod() throws Exception{
		Class<?> clazz = Class.forName("day13.javapro.reflect.HelloPrivate");
		Object obj = clazz.newInstance();
		
		Method m = clazz.getDeclaredMethod("show");
		m.setAccessible(true);
		m.invoke(obj);
	}
}
