package day13.javapro.reflect;

import java.lang.reflect.Field;

import org.junit.Test;

public class TestFields {
	@Test
	public void publicField() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		Field f = clazz.getField("name");
		System.out.println(f.get(obj));
	}
	
	@Test //获取私有属性，设置访问权限
	public void privateField() throws Exception {
		Class<?> clazz = Class.forName("day13.javapro.reflect.Hello");
		Object obj = clazz.newInstance();
		
		//获取属性
		Field f = clazz.getDeclaredField("id");
		//私有属性要设置权限
		f.setAccessible(true);
		System.out.println(f);
		
		//获取值，从对象实例获取值
		Integer id = (Integer)f.get(obj);
		System.out.println(id);
		
		//没有set，我要设置私有属性的值
		//第一参数field属性所属对象
		f.set(obj, 20);		//id=set(20)
		id = (Integer)f.get(obj);
		System.out.println(id);
	}
}
