package day13.javapro.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

public class TestMethods {
	@Test
	public void showMethod() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		//获取指定方法
		Method m1 = clazz.getMethod("show");
		//obj这个对象的m的方法回调（执行）
		m1.invoke(obj);
		
		Method m2 = clazz.getMethod("show", String.class);
		m2.invoke(obj, "tom");
	}
	
	@Test//获取这个类的所有的方法
	public void all() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		//返回所有方法，普通方法
		Method[] ms = clazz.getMethods();
		for(Method x : ms) {
			System.out.println(x);
		}
	}
}
